// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetVulStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetVulStatisticsRequest</p>
 */
public class GetVulStatisticsRequest extends Request {
    @Query
    @NameInMap("GroupIdList")
    private String groupIdList;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("TypeList")
    private String typeList;


    private GetVulStatisticsRequest(Builder builder) {
        super(builder);
        this.groupIdList = builder.groupIdList;
        this.sourceIp = builder.sourceIp;
        this.typeList = builder.typeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVulStatisticsRequest create() {
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

    /**
     * @return typeList
     */
    public String getTypeList() {
        return this.typeList;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String groupIdList; 
        private String sourceIp; 
        private String typeList; 

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

        /**
         * <p>TypeList.</p>
         */
        public Builder typeList(String typeList) {
            this.putQueryParameter("TypeList", typeList);
            this.typeList = typeList;
            return this;
        }

        public GetVulStatisticsRequest build() {
            return new GetVulStatisticsRequest(this);
        } 

    } 

}
