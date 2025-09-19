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
         * <p>The ID of the asset group. Separate multiple IDs with commas (,).</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to query the IDs of asset groups.</p>
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

        /**
         * <p>The type of the vulnerability whose statistics you want to query. Separate multiple types with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: Linux software vulnerability</li>
         * <li><strong>sys</strong>: Windows system vulnerability</li>
         * <li><strong>cms</strong>: Web-CMS vulnerability</li>
         * <li><strong>emg</strong>: urgent vulnerability</li>
         * <li><strong>app</strong>: vulnerability detected by using a web scanner</li>
         * <li><strong>sca</strong>: vulnerability detected based on software component analysis</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cve</p>
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
