// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteChangeSetRequest} extends {@link RequestModel}
 *
 * <p>ExecuteChangeSetRequest</p>
 */
public class ExecuteChangeSetRequest extends Request {
    @Query
    @NameInMap("ChangeSetId")
    private String changeSetId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("RegionId")
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

        private Builder(ExecuteChangeSetRequest response) {
            super(response);
            this.changeSetId = response.changeSetId;
            this.clientToken = response.clientToken;
            this.regionId = response.regionId;
        } 

        /**
         * ChangeSetId.
         */
        public Builder changeSetId(String changeSetId) {
            this.putQueryParameter("ChangeSetId", changeSetId);
            this.changeSetId = changeSetId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * RegionId.
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
