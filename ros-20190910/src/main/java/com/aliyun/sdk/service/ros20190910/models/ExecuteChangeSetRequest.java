// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteChangeSetRequest} extends {@link RequestModel}
 *
 * <p>ExecuteChangeSetRequest</p>
 */
public class ExecuteChangeSetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChangeSetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String changeSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ExecuteChangeSetRequest(Builder builder) {
        super(builder);
        this.changeSetId = builder.changeSetId;
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteChangeSetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return changeSetId
     */
    public String getChangeSetId() {
        return this.changeSetId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ExecuteChangeSetRequest, Builder> {
        private String changeSetId; 
        private String clientToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteChangeSetRequest request) {
            super(request);
            this.changeSetId = request.changeSetId;
            this.clientToken = request.clientToken;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the change set.
         */
        public Builder changeSetId(String changeSetId) {
            this.putQueryParameter("ChangeSetId", changeSetId);
            this.changeSetId = changeSetId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests.
         * <p>
         * 
         * The token can be up to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (\_).
         * 
         * For more information, see [How to ensure idempotence](~~134212~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The region ID of the change set. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ExecuteChangeSetRequest build() {
            return new ExecuteChangeSetRequest(this);
        } 

    } 

}
