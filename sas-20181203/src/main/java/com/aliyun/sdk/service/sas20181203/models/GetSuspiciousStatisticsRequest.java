// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetSuspiciousStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetSuspiciousStatisticsRequest</p>
 */
public class GetSuspiciousStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
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
         * <p>The ID of the asset group. Separate multiple IDs with commas (,).</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to query the IDs of asset groups.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9997897</p>
         */
        public Builder groupIdList(String groupIdList) {
            this.putQueryParameter("GroupIdList", groupIdList);
            this.groupIdList = groupIdList;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>10.12.XX.XX</p>
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
