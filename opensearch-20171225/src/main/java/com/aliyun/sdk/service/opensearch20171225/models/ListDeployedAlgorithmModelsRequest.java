// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeployedAlgorithmModelsRequest} extends {@link RequestModel}
 *
 * <p>ListDeployedAlgorithmModelsRequest</p>
 */
public class ListDeployedAlgorithmModelsRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Query
    @NameInMap("algorithmType")
    private String algorithmType;

    @Query
    @NameInMap("inServiceOnly")
    private Boolean inServiceOnly;

    private ListDeployedAlgorithmModelsRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.algorithmType = builder.algorithmType;
        this.inServiceOnly = builder.inServiceOnly;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeployedAlgorithmModelsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return algorithmType
     */
    public String getAlgorithmType() {
        return this.algorithmType;
    }

    /**
     * @return inServiceOnly
     */
    public Boolean getInServiceOnly() {
        return this.inServiceOnly;
    }

    public static final class Builder extends Request.Builder<ListDeployedAlgorithmModelsRequest, Builder> {
        private String appGroupIdentity; 
        private String algorithmType; 
        private Boolean inServiceOnly; 

        private Builder() {
            super();
        } 

        private Builder(ListDeployedAlgorithmModelsRequest response) {
            super(response);
            this.appGroupIdentity = response.appGroupIdentity;
            this.algorithmType = response.algorithmType;
            this.inServiceOnly = response.inServiceOnly;
        } 

        /**
         * appGroupIdentity.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * algorithmType.
         */
        public Builder algorithmType(String algorithmType) {
            this.putQueryParameter("algorithmType", algorithmType);
            this.algorithmType = algorithmType;
            return this;
        }

        /**
         * inServiceOnly.
         */
        public Builder inServiceOnly(Boolean inServiceOnly) {
            this.putQueryParameter("inServiceOnly", inServiceOnly);
            this.inServiceOnly = inServiceOnly;
            return this;
        }

        @Override
        public ListDeployedAlgorithmModelsRequest build() {
            return new ListDeployedAlgorithmModelsRequest(this);
        } 

    } 

}
