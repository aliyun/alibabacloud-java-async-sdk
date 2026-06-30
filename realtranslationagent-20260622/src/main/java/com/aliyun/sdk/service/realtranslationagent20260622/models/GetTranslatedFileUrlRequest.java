// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.realtranslationagent20260622.models;

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
 * {@link GetTranslatedFileUrlRequest} extends {@link RequestModel}
 *
 * <p>GetTranslatedFileUrlRequest</p>
 */
public class GetTranslatedFileUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("APIKey")
    private String APIKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private GetTranslatedFileUrlRequest(Builder builder) {
        super(builder);
        this.APIKey = builder.APIKey;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTranslatedFileUrlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return APIKey
     */
    public String getAPIKey() {
        return this.APIKey;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetTranslatedFileUrlRequest, Builder> {
        private String APIKey; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetTranslatedFileUrlRequest request) {
            super(request);
            this.APIKey = request.APIKey;
            this.taskId = request.taskId;
        } 

        /**
         * APIKey.
         */
        public Builder APIKey(String APIKey) {
            this.putQueryParameter("APIKey", APIKey);
            this.APIKey = APIKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f9c35b0453b</p>
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetTranslatedFileUrlRequest build() {
            return new GetTranslatedFileUrlRequest(this);
        } 

    } 

}
