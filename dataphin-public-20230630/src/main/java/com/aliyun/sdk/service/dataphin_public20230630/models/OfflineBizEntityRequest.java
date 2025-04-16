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
 * {@link OfflineBizEntityRequest} extends {@link RequestModel}
 *
 * <p>OfflineBizEntityRequest</p>
 */
public class OfflineBizEntityRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OfflineCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private OfflineCommand offlineCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private OfflineBizEntityRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.offlineCommand = builder.offlineCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OfflineBizEntityRequest create() {
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
     * @return offlineCommand
     */
    public OfflineCommand getOfflineCommand() {
        return this.offlineCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<OfflineBizEntityRequest, Builder> {
        private String regionId; 
        private OfflineCommand offlineCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(OfflineBizEntityRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.offlineCommand = request.offlineCommand;
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
        public Builder offlineCommand(OfflineCommand offlineCommand) {
            String offlineCommandShrink = shrink(offlineCommand, "OfflineCommand", "json");
            this.putBodyParameter("OfflineCommand", offlineCommandShrink);
            this.offlineCommand = offlineCommand;
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
        public OfflineBizEntityRequest build() {
            return new OfflineBizEntityRequest(this);
        } 

    } 

    /**
     * 
     * {@link OfflineBizEntityRequest} extends {@link TeaModel}
     *
     * <p>OfflineBizEntityRequest</p>
     */
    public static class OfflineCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUnitId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long bizUnitId;

        @com.aliyun.core.annotation.NameInMap("Comment")
        @com.aliyun.core.annotation.Validation(required = true)
        private String comment;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private OfflineCommand(Builder builder) {
            this.bizUnitId = builder.bizUnitId;
            this.comment = builder.comment;
            this.id = builder.id;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OfflineCommand create() {
            return builder().build();
        }

        /**
         * @return bizUnitId
         */
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long bizUnitId; 
            private String comment; 
            private Long id; 
            private String type; 

            private Builder() {
            } 

            private Builder(OfflineCommand model) {
                this.bizUnitId = model.bizUnitId;
                this.comment = model.comment;
                this.id = model.id;
                this.type = model.type;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>6798087749072704</p>
             */
            public Builder bizUnitId(Long bizUnitId) {
                this.bizUnitId = bizUnitId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>101001201</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>BIZ_OBJECT</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public OfflineCommand build() {
                return new OfflineCommand(this);
            } 

        } 

    }
}
