// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVulStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetVulStatisticsRequest</p>
 */
public class GetVulStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TypeList")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(GetVulStatisticsRequest request) {
            super(request);
            this.groupIdList = request.groupIdList;
            this.sourceIp = request.sourceIp;
            this.typeList = request.typeList;
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

        /**
         * The type of the vulnerability whose statistics you want to query. Separate multiple types with commas (,). Valid values:
         * <p>
         * 
         * *   **cve**: Linux software vulnerability
         * *   **sys**: Windows system vulnerability
         * *   **cms**: Web-CMS vulnerability
         * *   **emg**: urgent vulnerability
         * *   **app**: vulnerability detected by using a web scanner
         * *   **sca**: vulnerability detected based on software component analysis
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
