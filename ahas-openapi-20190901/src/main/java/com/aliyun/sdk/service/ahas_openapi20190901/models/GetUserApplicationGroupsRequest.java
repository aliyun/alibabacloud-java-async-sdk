// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserApplicationGroupsRequest} extends {@link RequestModel}
 *
 * <p>GetUserApplicationGroupsRequest</p>
 */
public class GetUserApplicationGroupsRequest extends Request {
    @Query
    @NameInMap("AhasRegionId")
    private String ahasRegionId;

    @Query
    @NameInMap("ApplicationId")
    @Validation(required = true)
    private String applicationId;

    @Query
    @NameInMap("NameSpace")
    private String nameSpace;

    private GetUserApplicationGroupsRequest(Builder builder) {
        super(builder);
        this.ahasRegionId = builder.ahasRegionId;
        this.applicationId = builder.applicationId;
        this.nameSpace = builder.nameSpace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserApplicationGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ahasRegionId
     */
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return nameSpace
     */
    public String getNameSpace() {
        return this.nameSpace;
    }

    public static final class Builder extends Request.Builder<GetUserApplicationGroupsRequest, Builder> {
        private String ahasRegionId; 
        private String applicationId; 
        private String nameSpace; 

        private Builder() {
            super();
        } 

        private Builder(GetUserApplicationGroupsRequest response) {
            super(response);
            this.ahasRegionId = response.ahasRegionId;
            this.applicationId = response.applicationId;
            this.nameSpace = response.nameSpace;
        } 

        /**
         * AhasRegionId.
         */
        public Builder ahasRegionId(String ahasRegionId) {
            this.putQueryParameter("AhasRegionId", ahasRegionId);
            this.ahasRegionId = ahasRegionId;
            return this;
        }

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * NameSpace.
         */
        public Builder nameSpace(String nameSpace) {
            this.putQueryParameter("NameSpace", nameSpace);
            this.nameSpace = nameSpace;
            return this;
        }

        @Override
        public GetUserApplicationGroupsRequest build() {
            return new GetUserApplicationGroupsRequest(this);
        } 

    } 

}
