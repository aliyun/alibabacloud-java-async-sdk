// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeClientConfStrategyRequest} extends {@link RequestModel}
 *
 * <p>DescribeClientConfStrategyRequest</p>
 */
public class DescribeClientConfStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tagValue;

    private DescribeClientConfStrategyRequest(Builder builder) {
        super(builder);
        this.tag = builder.tag;
        this.tagValue = builder.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClientConfStrategyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * @return tagValue
     */
    public String getTagValue() {
        return this.tagValue;
    }

    public static final class Builder extends Request.Builder<DescribeClientConfStrategyRequest, Builder> {
        private String tag; 
        private String tagValue; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClientConfStrategyRequest request) {
            super(request);
            this.tag = request.tag;
            this.tagValue = request.tagValue;
        } 

        /**
         * <p>The tag that is added to the server.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>machineResource</p>
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The value of the tag. Valid values:</p>
         * <ul>
         * <li>major</li>
         * <li>advanced</li>
         * <li>basic</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>major</p>
         */
        public Builder tagValue(String tagValue) {
            this.putQueryParameter("TagValue", tagValue);
            this.tagValue = tagValue;
            return this;
        }

        @Override
        public DescribeClientConfStrategyRequest build() {
            return new DescribeClientConfStrategyRequest(this);
        } 

    } 

}
