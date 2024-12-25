// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link CreateDialogRequest} extends {@link RequestModel}
 *
 * <p>CreateDialogRequest</p>
 */
public class CreateDialogRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("channel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enableLibrary")
    private Boolean enableLibrary;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("metaData")
    private java.util.Map<String, ?> metaData;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("playCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String playCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("qaLibraryList")
    private java.util.List<String> qaLibraryList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("requestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("selfDirected")
    private Boolean selfDirected;

    private CreateDialogRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.channel = builder.channel;
        this.enableLibrary = builder.enableLibrary;
        this.metaData = builder.metaData;
        this.playCode = builder.playCode;
        this.qaLibraryList = builder.qaLibraryList;
        this.requestId = builder.requestId;
        this.selfDirected = builder.selfDirected;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDialogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return enableLibrary
     */
    public Boolean getEnableLibrary() {
        return this.enableLibrary;
    }

    /**
     * @return metaData
     */
    public java.util.Map<String, ?> getMetaData() {
        return this.metaData;
    }

    /**
     * @return playCode
     */
    public String getPlayCode() {
        return this.playCode;
    }

    /**
     * @return qaLibraryList
     */
    public java.util.List<String> getQaLibraryList() {
        return this.qaLibraryList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return selfDirected
     */
    public Boolean getSelfDirected() {
        return this.selfDirected;
    }

    public static final class Builder extends Request.Builder<CreateDialogRequest, Builder> {
        private String workspaceId; 
        private String channel; 
        private Boolean enableLibrary; 
        private java.util.Map<String, ?> metaData; 
        private String playCode; 
        private java.util.List<String> qaLibraryList; 
        private String requestId; 
        private Boolean selfDirected; 

        private Builder() {
            super();
        } 

        private Builder(CreateDialogRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.channel = request.channel;
            this.enableLibrary = request.enableLibrary;
            this.metaData = request.metaData;
            this.playCode = request.playCode;
            this.qaLibraryList = request.qaLibraryList;
            this.requestId = request.requestId;
            this.selfDirected = request.selfDirected;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>taobao</p>
         */
        public Builder channel(String channel) {
            this.putBodyParameter("channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * enableLibrary.
         */
        public Builder enableLibrary(Boolean enableLibrary) {
            this.putBodyParameter("enableLibrary", enableLibrary);
            this.enableLibrary = enableLibrary;
            return this;
        }

        /**
         * metaData.
         */
        public Builder metaData(java.util.Map<String, ?> metaData) {
            this.putBodyParameter("metaData", metaData);
            this.metaData = metaData;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>live_broadcast_qa</p>
         */
        public Builder playCode(String playCode) {
            this.putBodyParameter("playCode", playCode);
            this.playCode = playCode;
            return this;
        }

        /**
         * qaLibraryList.
         */
        public Builder qaLibraryList(java.util.List<String> qaLibraryList) {
            this.putBodyParameter("qaLibraryList", qaLibraryList);
            this.qaLibraryList = qaLibraryList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ebf83826-dc1c-46f8-9759-0fb6da4c8xxx</p>
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("requestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * selfDirected.
         */
        public Builder selfDirected(Boolean selfDirected) {
            this.putBodyParameter("selfDirected", selfDirected);
            this.selfDirected = selfDirected;
            return this;
        }

        @Override
        public CreateDialogRequest build() {
            return new CreateDialogRequest(this);
        } 

    } 

}
