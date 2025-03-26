// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ListTextbookAssistantGradeVolumesRequest} extends {@link RequestModel}
 *
 * <p>ListTextbookAssistantGradeVolumesRequest</p>
 */
public class ListTextbookAssistantGradeVolumesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("authToken")
    private String authToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scenario")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scenario;

    private ListTextbookAssistantGradeVolumesRequest(Builder builder) {
        super(builder);
        this.authToken = builder.authToken;
        this.scenario = builder.scenario;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTextbookAssistantGradeVolumesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authToken
     */
    public String getAuthToken() {
        return this.authToken;
    }

    /**
     * @return scenario
     */
    public String getScenario() {
        return this.scenario;
    }

    public static final class Builder extends Request.Builder<ListTextbookAssistantGradeVolumesRequest, Builder> {
        private String authToken; 
        private String scenario; 

        private Builder() {
            super();
        } 

        private Builder(ListTextbookAssistantGradeVolumesRequest request) {
            super(request);
            this.authToken = request.authToken;
            this.scenario = request.scenario;
        } 

        /**
         * authToken.
         */
        public Builder authToken(String authToken) {
            this.putBodyParameter("authToken", authToken);
            this.authToken = authToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SYNC</p>
         */
        public Builder scenario(String scenario) {
            this.putBodyParameter("scenario", scenario);
            this.scenario = scenario;
            return this;
        }

        @Override
        public ListTextbookAssistantGradeVolumesRequest build() {
            return new ListTextbookAssistantGradeVolumesRequest(this);
        } 

    } 

}
