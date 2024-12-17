// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link TestRuleV4Request} extends {@link RequestModel}
 *
 * <p>TestRuleV4Request</p>
 */
public class TestRuleV4Request extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsSchemeData")
    private Integer isSchemeData;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TestJson")
    @com.aliyun.core.annotation.Validation(required = true)
    private String testJson;

    private TestRuleV4Request(Builder builder) {
        super(builder);
        this.isSchemeData = builder.isSchemeData;
        this.testJson = builder.testJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TestRuleV4Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isSchemeData
     */
    public Integer getIsSchemeData() {
        return this.isSchemeData;
    }

    /**
     * @return testJson
     */
    public String getTestJson() {
        return this.testJson;
    }

    public static final class Builder extends Request.Builder<TestRuleV4Request, Builder> {
        private Integer isSchemeData; 
        private String testJson; 

        private Builder() {
            super();
        } 

        private Builder(TestRuleV4Request request) {
            super(request);
            this.isSchemeData = request.isSchemeData;
            this.testJson = request.testJson;
        } 

        /**
         * IsSchemeData.
         */
        public Builder isSchemeData(Integer isSchemeData) {
            this.putBodyParameter("IsSchemeData", isSchemeData);
            this.isSchemeData = isSchemeData;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder testJson(String testJson) {
            this.putBodyParameter("TestJson", testJson);
            this.testJson = testJson;
            return this;
        }

        @Override
        public TestRuleV4Request build() {
            return new TestRuleV4Request(this);
        } 

    } 

}
