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
 * {@link DescribeInstanceVulStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceVulStatisticsRequest</p>
 */
public class DescribeInstanceVulStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Types")
    private String types;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuid;

    private DescribeInstanceVulStatisticsRequest(Builder builder) {
        super(builder);
        this.types = builder.types;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceVulStatisticsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return types
     */
    public String getTypes() {
        return this.types;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceVulStatisticsRequest, Builder> {
        private String types; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceVulStatisticsRequest request) {
            super(request);
            this.types = request.types;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The vulnerability type of the Serverless asset. Valid values:</p>
         * <ul>
         * <li><p><strong>sca</strong>: middleware vulnerability</p>
         * </li>
         * <li><p><strong>app</strong>: scanner vulnerability</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Serverless assets currently support only application vulnerability scanning.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sca,app</p>
         */
        public Builder types(String types) {
            this.putQueryParameter("Types", types);
            this.types = types;
            return this;
        }

        /**
         * <p>The UUID of the asset instance to query.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to obtain this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5b268326-273e-44fc-a0e3-9482435c****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public DescribeInstanceVulStatisticsRequest build() {
            return new DescribeInstanceVulStatisticsRequest(this);
        } 

    } 

}
