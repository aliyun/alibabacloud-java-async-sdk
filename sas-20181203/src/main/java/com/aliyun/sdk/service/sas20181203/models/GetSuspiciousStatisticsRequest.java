// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSuspiciousStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetSuspiciousStatisticsRequest</p>
 */
public class GetSuspiciousStatisticsRequest extends Request {
    @Query
    @NameInMap("GroupIdList")
    @Validation(required = true)
    private String groupIdList;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private GetSuspiciousStatisticsRequest(Builder builder) {
        super(builder);
        this.groupIdList = builder.groupIdList;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSuspiciousStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupIdList
     */
    public String getGroupIdList() {
        return this.groupIdList;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<GetSuspiciousStatisticsRequest, Builder> {
        private String groupIdList; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(GetSuspiciousStatisticsRequest request) {
            super(request);
            this.groupIdList = request.groupIdList;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * The ID of the asset group. Separate multiple IDs with commas (,).
         * <p>
         * 
         * >  You can call the [DescribeAllGroups](~~DescribeAllGroups~~) operation to query the IDs of asset groups.
         */
        public Builder groupIdList(String groupIdList) {
            this.putQueryParameter("GroupIdList", groupIdList);
            this.groupIdList = groupIdList;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public GetSuspiciousStatisticsRequest build() {
            return new GetSuspiciousStatisticsRequest(this);
        } 

    } 

}
