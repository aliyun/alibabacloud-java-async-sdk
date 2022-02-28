// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

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

    /**
     * @return typeList
     */
    public String getTypeList() {
        return this.typeList;
    }

    public static final class Builder extends Request.Builder<GetVulStatisticsRequest, Builder> {
        private String groupIdList; 
        private String sourceIp; 
        private String typeList; 

        private Builder() {
            super();
        } 

        private Builder(GetVulStatisticsRequest response) {
            super(response);
            this.groupIdList = response.groupIdList;
            this.sourceIp = response.sourceIp;
            this.typeList = response.typeList;
        } 

        /**
         * GroupIdList.
         */
        public Builder groupIdList(String groupIdList) {
            this.putQueryParameter("GroupIdList", groupIdList);
            this.groupIdList = groupIdList;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * TypeList.
         */
        public Builder typeList(String typeList) {
            this.putQueryParameter("TypeList", typeList);
            this.typeList = typeList;
            return this;
        }

        @Override
        public GetVulStatisticsRequest build() {
            return new GetVulStatisticsRequest(this);
        } 

    } 

}
