// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link DeleteJobTemplatesRequest} extends {@link RequestModel}
 *
 * <p>DeleteJobTemplatesRequest</p>
 */
public class DeleteJobTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Templates")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templates;

    private DeleteJobTemplatesRequest(Builder builder) {
        super(builder);
        this.templates = builder.templates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteJobTemplatesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return templates
     */
    public String getTemplates() {
        return this.templates;
    }

    public static final class Builder extends Request.Builder<DeleteJobTemplatesRequest, Builder> {
        private String templates; 

        private Builder() {
            super();
        } 

        private Builder(DeleteJobTemplatesRequest request) {
            super(request);
            this.templates = request.templates;
        } 

        /**
         * <p>The IDs of the job templates that you want to delete. You can specify a maximum of 20 job template IDs.</p>
         * <p>Format of job template IDs: <code>[{&quot;Id&quot;: &quot;0.sched****&quot;},{&quot;Id&quot;: &quot;1.sched****&quot;}]</code>. Separate multiple job template IDs with commas (,).</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87248.html">ListJobTemplates</a> operation to query job template IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Id&quot;:&quot;ehpc-job-tmpl-6RVcMK****&quot;},{&quot;Id&quot;: &quot;ehpc-job-tmpl-6RxO5y****&quot;}]</p>
         */
        public Builder templates(String templates) {
            this.putQueryParameter("Templates", templates);
            this.templates = templates;
            return this;
        }

        @Override
        public DeleteJobTemplatesRequest build() {
            return new DeleteJobTemplatesRequest(this);
        } 

    } 

}
