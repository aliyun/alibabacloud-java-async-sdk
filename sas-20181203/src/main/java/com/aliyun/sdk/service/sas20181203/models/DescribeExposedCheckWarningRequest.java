// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeExposedCheckWarningRequest} extends {@link RequestModel}
 *
 * <p>DescribeExposedCheckWarningRequest</p>
 */
public class DescribeExposedCheckWarningRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TypeName")
    private String typeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    private String uuids;

    private DescribeExposedCheckWarningRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.typeName = builder.typeName;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExposedCheckWarningRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return typeName
     */
    public String getTypeName() {
        return this.typeName;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<DescribeExposedCheckWarningRequest, Builder> {
        private String lang; 
        private String typeName; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExposedCheckWarningRequest request) {
            super(request);
            this.lang = request.lang;
            this.typeName = request.typeName;
            this.uuids = request.uuids;
        } 

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The type of the baseline.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeRiskType~~">DescribeRiskType</a> operation to obtain the types of baselines from the response parameter <strong>TypeName</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>weak_password</p>
         */
        public Builder typeName(String typeName) {
            this.putQueryParameter("TypeName", typeName);
            this.typeName = typeName;
            return this;
        }

        /**
         * <p>The UUID of the server. Separate multiple UUIDs with commas (,).</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>6541631a-7d47-41fd-9fef-9518113f****</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public DescribeExposedCheckWarningRequest build() {
            return new DescribeExposedCheckWarningRequest(this);
        } 

    } 

}
