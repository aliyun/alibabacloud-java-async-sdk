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
 * {@link UpdateBasicProjectRequest} extends {@link RequestModel}
 *
 * <p>UpdateBasicProjectRequest</p>
 */
public class UpdateBasicProjectRequest extends Request {
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

    private UpdateBasicProjectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.updateCommand = builder.updateCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBasicProjectRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateBasicProjectRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private UpdateCommand updateCommand; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBasicProjectRequest request) {
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
        public UpdateBasicProjectRequest build() {
            return new UpdateBasicProjectRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateBasicProjectRequest} extends {@link TeaModel}
     *
     * <p>UpdateBasicProjectRequest</p>
     */
    public static class WhiteLists extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        private WhiteLists(Builder builder) {
            this.description = builder.description;
            this.ip = builder.ip;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WhiteLists create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        public static final class Builder {
            private String description; 
            private String ip; 
            private String port; 

            private Builder() {
            } 

            private Builder(WhiteLists model) {
                this.description = model.description;
                this.ip = model.ip;
                this.port = model.port;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            public WhiteLists build() {
                return new WhiteLists(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateBasicProjectRequest} extends {@link TeaModel}
     *
     * <p>UpdateBasicProjectRequest</p>
     */
    public static class UpdateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUnitId")
        private Long bizUnitId;

        @com.aliyun.core.annotation.NameInMap("ComputeSourceId")
        private Long computeSourceId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("NameSpaceTag")
        private String nameSpaceTag;

        @com.aliyun.core.annotation.NameInMap("StreamComputeSourceId")
        private Long streamComputeSourceId;

        @com.aliyun.core.annotation.NameInMap("WhiteLists")
        private java.util.List<WhiteLists> whiteLists;

        private UpdateCommand(Builder builder) {
            this.bizUnitId = builder.bizUnitId;
            this.computeSourceId = builder.computeSourceId;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.id = builder.id;
            this.name = builder.name;
            this.nameSpaceTag = builder.nameSpaceTag;
            this.streamComputeSourceId = builder.streamComputeSourceId;
            this.whiteLists = builder.whiteLists;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateCommand create() {
            return builder().build();
        }

        /**
         * @return bizUnitId
         */
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        /**
         * @return computeSourceId
         */
        public Long getComputeSourceId() {
            return this.computeSourceId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nameSpaceTag
         */
        public String getNameSpaceTag() {
            return this.nameSpaceTag;
        }

        /**
         * @return streamComputeSourceId
         */
        public Long getStreamComputeSourceId() {
            return this.streamComputeSourceId;
        }

        /**
         * @return whiteLists
         */
        public java.util.List<WhiteLists> getWhiteLists() {
            return this.whiteLists;
        }

        public static final class Builder {
            private Long bizUnitId; 
            private Long computeSourceId; 
            private String description; 
            private String displayName; 
            private Long id; 
            private String name; 
            private String nameSpaceTag; 
            private Long streamComputeSourceId; 
            private java.util.List<WhiteLists> whiteLists; 

            private Builder() {
            } 

            private Builder(UpdateCommand model) {
                this.bizUnitId = model.bizUnitId;
                this.computeSourceId = model.computeSourceId;
                this.description = model.description;
                this.displayName = model.displayName;
                this.id = model.id;
                this.name = model.name;
                this.nameSpaceTag = model.nameSpaceTag;
                this.streamComputeSourceId = model.streamComputeSourceId;
                this.whiteLists = model.whiteLists;
            } 

            /**
             * BizUnitId.
             */
            public Builder bizUnitId(Long bizUnitId) {
                this.bizUnitId = bizUnitId;
                return this;
            }

            /**
             * ComputeSourceId.
             */
            public Builder computeSourceId(Long computeSourceId) {
                this.computeSourceId = computeSourceId;
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
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>102311</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>my_project</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NameSpaceTag.
             */
            public Builder nameSpaceTag(String nameSpaceTag) {
                this.nameSpaceTag = nameSpaceTag;
                return this;
            }

            /**
             * StreamComputeSourceId.
             */
            public Builder streamComputeSourceId(Long streamComputeSourceId) {
                this.streamComputeSourceId = streamComputeSourceId;
                return this;
            }

            /**
             * WhiteLists.
             */
            public Builder whiteLists(java.util.List<WhiteLists> whiteLists) {
                this.whiteLists = whiteLists;
                return this;
            }

            public UpdateCommand build() {
                return new UpdateCommand(this);
            } 

        } 

    }
}
