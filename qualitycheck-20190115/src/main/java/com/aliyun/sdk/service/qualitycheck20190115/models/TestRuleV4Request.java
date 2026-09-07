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
         * <p>Whether this is the new quality check version. Valid values: 0 (legacy version) and 1 (new version). Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isSchemeData(Integer isSchemeData) {
            this.putBodyParameter("IsSchemeData", isSchemeData);
            this.isSchemeData = isSchemeData;
            return this;
        }

        /**
         * <p>JSON request parameters for rule testing. For details, see the supplemental description of request parameters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ruleList&quot;:[9771],&quot;dialogues&quot;:[{&quot;begin&quot;:0,&quot;end&quot;:760,&quot;hourMinSec&quot;:&quot;00:00&quot;,&quot;role&quot;:&quot;客户&quot;,&quot;identity&quot;:&quot;客户&quot;,&quot;words&quot;:&quot;123&quot;},{&quot;begin&quot;:21004,&quot;end&quot;:21494,&quot;hourMinSec&quot;:&quot;00:21&quot;,&quot;role&quot;:&quot;客服&quot;,&quot;identity&quot;:&quot;客服&quot;,&quot;words&quot;:&quot;123&quot;}]}</p>
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
