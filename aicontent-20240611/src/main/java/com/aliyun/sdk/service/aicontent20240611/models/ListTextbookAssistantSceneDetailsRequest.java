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
 * {@link ListTextbookAssistantSceneDetailsRequest} extends {@link RequestModel}
 *
 * <p>ListTextbookAssistantSceneDetailsRequest</p>
 */
public class ListTextbookAssistantSceneDetailsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("authToken")
    private String authToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sceneIdList")
    private java.util.List<String> sceneIdList;

    private ListTextbookAssistantSceneDetailsRequest(Builder builder) {
        super(builder);
        this.authToken = builder.authToken;
        this.sceneIdList = builder.sceneIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTextbookAssistantSceneDetailsRequest create() {
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
     * @return sceneIdList
     */
    public java.util.List<String> getSceneIdList() {
        return this.sceneIdList;
    }

    public static final class Builder extends Request.Builder<ListTextbookAssistantSceneDetailsRequest, Builder> {
        private String authToken; 
        private java.util.List<String> sceneIdList; 

        private Builder() {
            super();
        } 

        private Builder(ListTextbookAssistantSceneDetailsRequest request) {
            super(request);
            this.authToken = request.authToken;
            this.sceneIdList = request.sceneIdList;
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
         * sceneIdList.
         */
        public Builder sceneIdList(java.util.List<String> sceneIdList) {
            this.putBodyParameter("sceneIdList", sceneIdList);
            this.sceneIdList = sceneIdList;
            return this;
        }

        @Override
        public ListTextbookAssistantSceneDetailsRequest build() {
            return new ListTextbookAssistantSceneDetailsRequest(this);
        } 

    } 

}
