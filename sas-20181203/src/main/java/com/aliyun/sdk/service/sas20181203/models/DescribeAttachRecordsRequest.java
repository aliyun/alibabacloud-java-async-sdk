// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAttachRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAttachRecordsRequest</p>
 */
public class DescribeAttachRecordsRequest extends Request {
    @Query
    @NameInMap("ApplicationId")
    @Validation(required = true)
    private String applicationId;

    @Query
    @NameInMap("EcsUUIDList")
    private java.util.List < String > ecsUUIDList;

    private DescribeAttachRecordsRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.ecsUUIDList = builder.ecsUUIDList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAttachRecordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return ecsUUIDList
     */
    public java.util.List < String > getEcsUUIDList() {
        return this.ecsUUIDList;
    }

    public static final class Builder extends Request.Builder<DescribeAttachRecordsRequest, Builder> {
        private String applicationId; 
        private java.util.List < String > ecsUUIDList; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAttachRecordsRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.ecsUUIDList = request.ecsUUIDList;
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
         * EcsUUIDList.
         */
        public Builder ecsUUIDList(java.util.List < String > ecsUUIDList) {
            this.putQueryParameter("EcsUUIDList", ecsUUIDList);
            this.ecsUUIDList = ecsUUIDList;
            return this;
        }

        @Override
        public DescribeAttachRecordsRequest build() {
            return new DescribeAttachRecordsRequest(this);
        } 

    } 

}
