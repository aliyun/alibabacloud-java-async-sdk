// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckQuaraFileIdRequest} extends {@link RequestModel}
 *
 * <p>CheckQuaraFileIdRequest</p>
 */
public class CheckQuaraFileIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuaraFileIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > quaraFileIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuid;

    private CheckQuaraFileIdRequest(Builder builder) {
        super(builder);
        this.quaraFileIds = builder.quaraFileIds;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckQuaraFileIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return quaraFileIds
     */
    public java.util.List < String > getQuaraFileIds() {
        return this.quaraFileIds;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<CheckQuaraFileIdRequest, Builder> {
        private java.util.List < String > quaraFileIds; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(CheckQuaraFileIdRequest request) {
            super(request);
            this.quaraFileIds = request.quaraFileIds;
            this.uuid = request.uuid;
        } 

        /**
         * The IDs of quarantined files that you want to check.
         * <p>
         * 
         * >  You can call the [DescribeSuspEventQuaraFiles](~~DescribeSuspEventQuaraFiles~~) operation to query the IDs of quarantined files.
         */
        public Builder quaraFileIds(java.util.List < String > quaraFileIds) {
            this.putQueryParameter("QuaraFileIds", quaraFileIds);
            this.quaraFileIds = quaraFileIds;
            return this;
        }

        /**
         * The UUID of the server on which you want to check quarantined files.
         * <p>
         * 
         * >  You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public CheckQuaraFileIdRequest build() {
            return new CheckQuaraFileIdRequest(this);
        } 

    } 

}
