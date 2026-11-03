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
 * {@link DescribeWebAppStaticsOutput} extends {@link TeaModel}
 *
 * <p>DescribeWebAppStaticsOutput</p>
 */
public class DescribeWebAppStaticsOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Length")
    private Integer length;

    @com.aliyun.core.annotation.NameInMap("WebAppStatics")
    private java.util.List<WebStaticsInfo> webAppStatics;

    private DescribeWebAppStaticsOutput(Builder builder) {
        this.length = builder.length;
        this.webAppStatics = builder.webAppStatics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebAppStaticsOutput create() {
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
     * @return webAppStatics
     */
    public java.util.List<WebStaticsInfo> getWebAppStatics() {
        return this.webAppStatics;
    }

    public static final class Builder {
        private Integer length; 
        private java.util.List<WebStaticsInfo> webAppStatics; 

        private Builder() {
        } 

        private Builder(DescribeWebAppStaticsOutput model) {
            this.length = model.length;
            this.webAppStatics = model.webAppStatics;
        } 

        /**
         * <p>The maximum number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder length(Integer length) {
            this.length = length;
            return this;
        }

        /**
         * <p>The static resources in the web application.</p>
         */
        public Builder webAppStatics(java.util.List<WebStaticsInfo> webAppStatics) {
            this.webAppStatics = webAppStatics;
            return this;
        }

        public DescribeWebAppStaticsOutput build() {
            return new DescribeWebAppStaticsOutput(this);
        } 

    } 

}
