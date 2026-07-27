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
 * {@link CreateBasicProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateBasicProjectRequest</p>
 */
public class CreateBasicProjectRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateCommand createCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private CreateBasicProjectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.createCommand = builder.createCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBasicProjectRequest create() {
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
     * @return createCommand
     */
    public CreateCommand getCreateCommand() {
        return this.createCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<CreateBasicProjectRequest, Builder> {
        private String regionId; 
        private CreateCommand createCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBasicProjectRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.createCommand = request.createCommand;
            this.opTenantId = request.opTenantId;
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
         */
        public Builder createCommand(CreateCommand createCommand) {
            String createCommandShrink = shrink(createCommand, "CreateCommand", "json");
            this.putBodyParameter("CreateCommand", createCommandShrink);
            this.createCommand = createCommand;
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

        @Override
        public CreateBasicProjectRequest build() {
            return new CreateBasicProjectRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateBasicProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateBasicProjectRequest</p>
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
     * {@link CreateBasicProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateBasicProjectRequest</p>
     */
    public static class CreateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUnitId")
        private Long bizUnitId;

        @com.aliyun.core.annotation.NameInMap("ComputeSourceId")
        private Long computeSourceId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("NameSpaceTag")
        private String nameSpaceTag;

        @com.aliyun.core.annotation.NameInMap("StreamComputeSourceId")
        private Long streamComputeSourceId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("WhiteLists")
        private java.util.List<WhiteLists> whiteLists;

        private CreateCommand(Builder builder) {
            this.bizUnitId = builder.bizUnitId;
            this.computeSourceId = builder.computeSourceId;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.name = builder.name;
            this.nameSpaceTag = builder.nameSpaceTag;
            this.streamComputeSourceId = builder.streamComputeSourceId;
            this.type = builder.type;
            this.whiteLists = builder.whiteLists;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateCommand create() {
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
         * @return type
         */
        public String getType() {
            return this.type;
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
            private String name; 
            private String nameSpaceTag; 
            private Long streamComputeSourceId; 
            private String type; 
            private java.util.List<WhiteLists> whiteLists; 

            private Builder() {
            } 

            private Builder(CreateCommand model) {
                this.bizUnitId = model.bizUnitId;
                this.computeSourceId = model.computeSourceId;
                this.description = model.description;
                this.displayName = model.displayName;
                this.name = model.name;
                this.nameSpaceTag = model.nameSpaceTag;
                this.streamComputeSourceId = model.streamComputeSourceId;
                this.type = model.type;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * WhiteLists.
             */
            public Builder whiteLists(java.util.List<WhiteLists> whiteLists) {
                this.whiteLists = whiteLists;
                return this;
            }

            public CreateCommand build() {
                return new CreateCommand(this);
            } 

        } 

    }
}
