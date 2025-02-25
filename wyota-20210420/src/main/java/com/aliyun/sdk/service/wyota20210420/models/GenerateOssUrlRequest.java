// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GenerateOssUrlRequest} extends {@link RequestModel}
 *
 * <p>GenerateOssUrlRequest</p>
 */
public class GenerateOssUrlRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ObjectNameList")
    private java.util.List < String > objectNameList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    private GenerateOssUrlRequest(Builder builder) {
        super(builder);
        this.objectNameList = builder.objectNameList;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateOssUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return objectNameList
     */
    public java.util.List < String > getObjectNameList() {
        return this.objectNameList;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<GenerateOssUrlRequest, Builder> {
        private java.util.List < String > objectNameList; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateOssUrlRequest request) {
            super(request);
            this.objectNameList = request.objectNameList;
            this.sessionId = request.sessionId;
        } 

        /**
         * ObjectNameList.
         */
        public Builder objectNameList(java.util.List < String > objectNameList) {
            this.putBodyParameter("ObjectNameList", objectNameList);
            this.objectNameList = objectNameList;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public GenerateOssUrlRequest build() {
            return new GenerateOssUrlRequest(this);
        } 

    } 

}
