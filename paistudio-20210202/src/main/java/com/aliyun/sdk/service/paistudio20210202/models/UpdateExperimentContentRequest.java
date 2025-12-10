// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link UpdateExperimentContentRequest} extends {@link RequestModel}
 *
 * <p>UpdateExperimentContentRequest</p>
 */
public class UpdateExperimentContentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String experimentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Version")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long version;

    private UpdateExperimentContentRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
        this.content = builder.content;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateExperimentContentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return experimentId
     */
    public String getExperimentId() {
        return this.experimentId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return version
     */
    public Long getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<UpdateExperimentContentRequest, Builder> {
        private String experimentId; 
        private String content; 
        private Long version; 

        private Builder() {
            super();
        } 

        private Builder(UpdateExperimentContentRequest request) {
            super(request);
            this.experimentId = request.experimentId;
            this.content = request.content;
            this.version = request.version;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>draft-i1udvvwm2rlvxug29n</p>
         */
        public Builder experimentId(String experimentId) {
            this.putPathParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;metadata&quot;: {       &quot;name&quot;: &quot;实验名称&quot;,       &quot;id&quot;: &quot;pai_exp_xxxdfafafasfa&quot;,       &quot;desc&quot;: &quot;实验描述&quot;,     },     &quot;nodes&quot;: [     ],     &quot;edges&quot;: [     ],     &quot;globalParams&quot;: [     ],     &quot;globalSettings&quot;:[     ]  }</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder version(Long version) {
            this.putBodyParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public UpdateExperimentContentRequest build() {
            return new UpdateExperimentContentRequest(this);
        } 

    } 

}
