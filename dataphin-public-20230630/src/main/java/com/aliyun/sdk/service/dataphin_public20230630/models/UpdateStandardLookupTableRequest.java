// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateStandardLookupTableRequest} extends {@link RequestModel}
 *
 * <p>UpdateStandardLookupTableRequest</p>
 */
public class UpdateStandardLookupTableRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateCommand updateCommand;

    private UpdateStandardLookupTableRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.updateCommand = builder.updateCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateStandardLookupTableRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return updateCommand
     */
    public UpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static final class Builder extends Request.Builder<UpdateStandardLookupTableRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private UpdateCommand updateCommand; 

        private Builder() {
            super();
        } 

        private Builder(UpdateStandardLookupTableRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.updateCommand = request.updateCommand;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder updateCommand(UpdateCommand updateCommand) {
            String updateCommandShrink = shrink(updateCommand, "UpdateCommand", "json");
            this.putBodyParameter("UpdateCommand", updateCommandShrink);
            this.updateCommand = updateCommand;
            return this;
        }

        @Override
        public UpdateStandardLookupTableRequest build() {
            return new UpdateStandardLookupTableRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateStandardLookupTableRequest} extends {@link TeaModel}
     *
     * <p>UpdateStandardLookupTableRequest</p>
     */
    public static class DirectoryReference extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Directory")
        @com.aliyun.core.annotation.Validation(required = true)
        private String directory;

        private DirectoryReference(Builder builder) {
            this.directory = builder.directory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DirectoryReference create() {
            return builder().build();
        }

        /**
         * @return directory
         */
        public String getDirectory() {
            return this.directory;
        }

        public static final class Builder {
            private String directory; 

            private Builder() {
            } 

            private Builder(DirectoryReference model) {
                this.directory = model.directory;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>/dir1/dir2</p>
             */
            public Builder directory(String directory) {
                this.directory = directory;
                return this;
            }

            public DirectoryReference build() {
                return new DirectoryReference(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateStandardLookupTableRequest} extends {@link TeaModel}
     *
     * <p>UpdateStandardLookupTableRequest</p>
     */
    public static class LookupTableValueList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnglishName")
        private String englishName;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
        private String value;

        private LookupTableValueList(Builder builder) {
            this.description = builder.description;
            this.englishName = builder.englishName;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LookupTableValueList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return englishName
         */
        public String getEnglishName() {
            return this.englishName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String englishName; 
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(LookupTableValueList model) {
                this.description = model.description;
                this.englishName = model.englishName;
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EnglishName.
             */
            public Builder englishName(String englishName) {
                this.englishName = englishName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Hangzhou</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>杭州</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public LookupTableValueList build() {
                return new LookupTableValueList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateStandardLookupTableRequest} extends {@link TeaModel}
     *
     * <p>UpdateStandardLookupTableRequest</p>
     */
    public static class UpdateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String code;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DirectoryReference")
        private DirectoryReference directoryReference;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LookupTableValueList")
        private java.util.List<LookupTableValueList> lookupTableValueList;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        private UpdateCommand(Builder builder) {
            this.code = builder.code;
            this.description = builder.description;
            this.directoryReference = builder.directoryReference;
            this.id = builder.id;
            this.lookupTableValueList = builder.lookupTableValueList;
            this.name = builder.name;
            this.owner = builder.owner;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateCommand create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return directoryReference
         */
        public DirectoryReference getDirectoryReference() {
            return this.directoryReference;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return lookupTableValueList
         */
        public java.util.List<LookupTableValueList> getLookupTableValueList() {
            return this.lookupTableValueList;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        public static final class Builder {
            private String code; 
            private String description; 
            private DirectoryReference directoryReference; 
            private Long id; 
            private java.util.List<LookupTableValueList> lookupTableValueList; 
            private String name; 
            private String owner; 

            private Builder() {
            } 

            private Builder(UpdateCommand model) {
                this.code = model.code;
                this.description = model.description;
                this.directoryReference = model.directoryReference;
                this.id = model.id;
                this.lookupTableValueList = model.lookupTableValueList;
                this.name = model.name;
                this.owner = model.owner;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CITY</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DirectoryReference.
             */
            public Builder directoryReference(DirectoryReference directoryReference) {
                this.directoryReference = directoryReference;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * LookupTableValueList.
             */
            public Builder lookupTableValueList(java.util.List<LookupTableValueList> lookupTableValueList) {
                this.lookupTableValueList = lookupTableValueList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>城市码表</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            public UpdateCommand build() {
                return new UpdateCommand(this);
            } 

        } 

    }
}
