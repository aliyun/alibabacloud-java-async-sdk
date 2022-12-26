// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClientConfStrategyRequest} extends {@link RequestModel}
 *
 * <p>DescribeClientConfStrategyRequest</p>
 */
public class DescribeClientConfStrategyRequest extends Request {
    @Query
    @NameInMap("Tag")
    @Validation(required = true)
    private String tag;

    @Query
    @NameInMap("TagValue")
    @Validation(required = true)
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
         * Tag.
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * TagValue.
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
