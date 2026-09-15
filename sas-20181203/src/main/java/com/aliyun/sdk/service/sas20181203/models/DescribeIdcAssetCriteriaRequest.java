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
 * {@link DescribeIdcAssetCriteriaRequest} extends {@link RequestModel}
 *
 * <p>DescribeIdcAssetCriteriaRequest</p>
 */
public class DescribeIdcAssetCriteriaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private DescribeIdcAssetCriteriaRequest(Builder builder) {
        super(builder);
        this.status = builder.status;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIdcAssetCriteriaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<DescribeIdcAssetCriteriaRequest, Builder> {
        private Integer status; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIdcAssetCriteriaRequest request) {
            super(request);
            this.status = request.status;
            this.value = request.value;
        } 

        /**
         * <p>Indicates whether the corresponding IP address is valid. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: valid</li>
         * <li><strong>1</strong>: ignored</li>
         * <li><strong>2</strong>: invalid</li>
         * <li><strong>3</strong>: expired</li>
         * <li><strong>4</strong>: probe does not exist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The fuzzy match value entered when querying assets.</p>
         * 
         * <strong>example:</strong>
         * <p>testwww</p>
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public DescribeIdcAssetCriteriaRequest build() {
            return new DescribeIdcAssetCriteriaRequest(this);
        } 

    } 

}
