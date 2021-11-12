// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetSuspiciousStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetSuspiciousStatisticsRequest</p>
 */
public class GetSuspiciousStatisticsRequest extends Request {
    @Query
    @NameInMap("GroupIdList")
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

    public static final class Builder extends Request.Builder {
        private String groupIdList; 
        private String sourceIp; 

        /**
         * <p>GroupIdList.</p>
         */
        public Builder groupIdList(String groupIdList) {
            this.putQueryParameter("GroupIdList", groupIdList);
            this.groupIdList = groupIdList;
            return this;
        }

        /**
         * <p>SourceIp.</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        public GetSuspiciousStatisticsRequest build() {
            return new GetSuspiciousStatisticsRequest(this);
        } 

    } 

}
