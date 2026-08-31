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
 * {@link GetDataAssetsGovernObjectRequest} extends {@link RequestModel}
 *
 * <p>GetDataAssetsGovernObjectRequest</p>
 */
public class GetDataAssetsGovernObjectRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Command")
    @com.aliyun.core.annotation.Validation(required = true)
    private Command command;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    private GetDataAssetsGovernObjectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.command = builder.command;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataAssetsGovernObjectRequest create() {
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
     * @return command
     */
    public Command getCommand() {
        return this.command;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    public static final class Builder extends Request.Builder<GetDataAssetsGovernObjectRequest, Builder> {
        private String regionId; 
        private Command command; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(GetDataAssetsGovernObjectRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.command = request.command;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
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
        public Builder command(Command command) {
            String commandShrink = shrink(command, "Command", "json");
            this.putBodyParameter("Command", commandShrink);
            this.command = command;
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
         * OpUserId.
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        @Override
        public GetDataAssetsGovernObjectRequest build() {
            return new GetDataAssetsGovernObjectRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetDataAssetsGovernObjectRequest} extends {@link TeaModel}
     *
     * <p>GetDataAssetsGovernObjectRequest</p>
     */
    public static class Command extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GovernObjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long governObjectId;

        private Command(Builder builder) {
            this.governObjectId = builder.governObjectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Command create() {
            return builder().build();
        }

        /**
         * @return governObjectId
         */
        public Long getGovernObjectId() {
            return this.governObjectId;
        }

        public static final class Builder {
            private Long governObjectId; 

            private Builder() {
            } 

            private Builder(Command model) {
                this.governObjectId = model.governObjectId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>22004</p>
             */
            public Builder governObjectId(Long governObjectId) {
                this.governObjectId = governObjectId;
                return this;
            }

            public Command build() {
                return new Command(this);
            } 

        } 

    }
}
