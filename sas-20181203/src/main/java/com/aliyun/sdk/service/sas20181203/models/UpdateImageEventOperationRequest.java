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
 * {@link UpdateImageEventOperationRequest} extends {@link RequestModel}
 *
 * <p>UpdateImageEventOperationRequest</p>
 */
public class UpdateImageEventOperationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Conditions")
    private String conditions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Note")
    private String note;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scenarios")
    private String scenarios;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    private UpdateImageEventOperationRequest(Builder builder) {
        super(builder);
        this.conditions = builder.conditions;
        this.id = builder.id;
        this.note = builder.note;
        this.scenarios = builder.scenarios;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateImageEventOperationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conditions
     */
    public String getConditions() {
        return this.conditions;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return note
     */
    public String getNote() {
        return this.note;
    }

    /**
     * @return scenarios
     */
    public String getScenarios() {
        return this.scenarios;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<UpdateImageEventOperationRequest, Builder> {
        private String conditions; 
        private Long id; 
        private String note; 
        private String scenarios; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(UpdateImageEventOperationRequest request) {
            super(request);
            this.conditions = request.conditions;
            this.id = request.id;
            this.note = request.note;
            this.scenarios = request.scenarios;
            this.source = request.source;
        } 

        /**
         * <p>The rule conditions. Specify a value in the JSON format. You can specify the following keys:</p>
         * <ul>
         * <li><strong>condition</strong>: the matching condition.</li>
         * <li><strong>type</strong>: the matching type.</li>
         * <li><strong>value</strong>: the matching value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;condition&quot;: &quot;MD5&quot;, &quot;type&quot;: &quot;equals&quot;, &quot;value&quot;: &quot;0083a31cc0083a31ccf7c10367a6e****&quot;}]</p>
         */
        public Builder conditions(String conditions) {
            this.putQueryParameter("Conditions", conditions);
            this.conditions = conditions;
            return this;
        }

        /**
         * <p>The ID of the alert handling rule. </p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeImageEventOperationPage~~">DescribeImageEventOperationPage</a> operation to query the ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>814163</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The remarks that you want to add.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder note(String note) {
            this.putQueryParameter("Note", note);
            this.note = note;
            return this;
        }

        /**
         * <p>The application scope of the rule. The value is in the JSON format. Valid values:</p>
         * <ul>
         * <li><strong>type</strong></li>
         * <li><strong>value</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;: &quot;repo&quot;, &quot;value&quot;: &quot;test-aaa/shenzhen-repo-01&quot;}</p>
         */
        public Builder scenarios(String scenarios) {
            this.putQueryParameter("Scenarios", scenarios);
            this.scenarios = scenarios;
            return this;
        }

        /**
         * <p>The source of the whitelist. Valid values:</p>
         * <ul>
         * <li><strong>image</strong>: image.</li>
         * <li><strong>agentless</strong>: agentless detection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>agentless</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public UpdateImageEventOperationRequest build() {
            return new UpdateImageEventOperationRequest(this);
        } 

    } 

}
