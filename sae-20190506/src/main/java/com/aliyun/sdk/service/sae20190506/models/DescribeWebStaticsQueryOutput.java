// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link DescribeWebStaticsQueryOutput} extends {@link TeaModel}
 *
 * <p>DescribeWebStaticsQueryOutput</p>
 */
public class DescribeWebStaticsQueryOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Length")
    private Integer length;

    @com.aliyun.core.annotation.NameInMap("WebStatics")
    private java.util.List<WebStaticsInfo> webStatics;

    private DescribeWebStaticsQueryOutput(Builder builder) {
        this.length = builder.length;
        this.webStatics = builder.webStatics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebStaticsQueryOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return length
     */
    public Integer getLength() {
        return this.length;
    }

    /**
     * @return webStatics
     */
    public java.util.List<WebStaticsInfo> getWebStatics() {
        return this.webStatics;
    }

    public static final class Builder {
        private Integer length; 
        private java.util.List<WebStaticsInfo> webStatics; 

        private Builder() {
        } 

        private Builder(DescribeWebStaticsQueryOutput model) {
            this.length = model.length;
            this.webStatics = model.webStatics;
        } 

        /**
         * Length.
         */
        public Builder length(Integer length) {
            this.length = length;
            return this;
        }

        /**
         * WebStatics.
         */
        public Builder webStatics(java.util.List<WebStaticsInfo> webStatics) {
            this.webStatics = webStatics;
            return this;
        }

        public DescribeWebStaticsQueryOutput build() {
            return new DescribeWebStaticsQueryOutput(this);
        } 

    } 

}
