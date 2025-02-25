// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link SubmitSparkLogAnalyzeTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitSparkLogAnalyzeTaskRequest</p>
 */
public class SubmitSparkLogAnalyzeTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    private SubmitSparkLogAnalyzeTaskRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSparkLogAnalyzeTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    public static final class Builder extends Request.Builder<SubmitSparkLogAnalyzeTaskRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSparkLogAnalyzeTaskRequest request) {
            super(request);
            this.appId = request.appId;
        } 

        /**
         * <p>The ID of the Spark application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>s202301121553hzd9c6f7xxxx</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public SubmitSparkLogAnalyzeTaskRequest build() {
            return new SubmitSparkLogAnalyzeTaskRequest(this);
        } 

    } 

}
