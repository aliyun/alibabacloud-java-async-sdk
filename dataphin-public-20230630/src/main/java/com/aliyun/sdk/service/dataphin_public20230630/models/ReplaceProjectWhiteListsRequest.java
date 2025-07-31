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
 * {@link ReplaceProjectWhiteListsRequest} extends {@link RequestModel}
 *
 * <p>ReplaceProjectWhiteListsRequest</p>
 */
public class ReplaceProjectWhiteListsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReplaceCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private ReplaceCommand replaceCommand;

    private ReplaceProjectWhiteListsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.id = builder.id;
        this.opTenantId = builder.opTenantId;
        this.replaceCommand = builder.replaceCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplaceProjectWhiteListsRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return replaceCommand
     */
    public ReplaceCommand getReplaceCommand() {
        return this.replaceCommand;
    }

    public static final class Builder extends Request.Builder<ReplaceProjectWhiteListsRequest, Builder> {
        private String regionId; 
        private Long id; 
        private Long opTenantId; 
        private ReplaceCommand replaceCommand; 

        private Builder() {
            super();
        } 

        private Builder(ReplaceProjectWhiteListsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.id = request.id;
            this.opTenantId = request.opTenantId;
            this.replaceCommand = request.replaceCommand;
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
         * <p>1030111021</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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
        public Builder replaceCommand(ReplaceCommand replaceCommand) {
            String replaceCommandShrink = shrink(replaceCommand, "ReplaceCommand", "json");
            this.putBodyParameter("ReplaceCommand", replaceCommandShrink);
            this.replaceCommand = replaceCommand;
            return this;
        }

        @Override
        public ReplaceProjectWhiteListsRequest build() {
            return new ReplaceProjectWhiteListsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ReplaceProjectWhiteListsRequest} extends {@link TeaModel}
     *
     * <p>ReplaceProjectWhiteListsRequest</p>
     */
    public static class WhiteLists extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Ip")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Port")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>ip</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10.1.0.2</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>5432</p>
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
     * {@link ReplaceProjectWhiteListsRequest} extends {@link TeaModel}
     *
     * <p>ReplaceProjectWhiteListsRequest</p>
     */
    public static class ReplaceCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WhiteLists")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<WhiteLists> whiteLists;

        private ReplaceCommand(Builder builder) {
            this.whiteLists = builder.whiteLists;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReplaceCommand create() {
            return builder().build();
        }

        /**
         * @return whiteLists
         */
        public java.util.List<WhiteLists> getWhiteLists() {
            return this.whiteLists;
        }

        public static final class Builder {
            private java.util.List<WhiteLists> whiteLists; 

            private Builder() {
            } 

            private Builder(ReplaceCommand model) {
                this.whiteLists = model.whiteLists;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder whiteLists(java.util.List<WhiteLists> whiteLists) {
                this.whiteLists = whiteLists;
                return this;
            }

            public ReplaceCommand build() {
                return new ReplaceCommand(this);
            } 

        } 

    }
}
