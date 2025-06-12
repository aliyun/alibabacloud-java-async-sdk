// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ListBeebotIntentLgfRequest} extends {@link RequestModel}
 *
 * <p>ListBeebotIntentLgfRequest</p>
 */
public class ListBeebotIntentLgfRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String intentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LgfText")
    private String lgfText;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scriptId;

    private ListBeebotIntentLgfRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.intentId = builder.intentId;
        this.lgfText = builder.lgfText;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.scriptId = builder.scriptId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBeebotIntentLgfRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return intentId
     */
    public String getIntentId() {
        return this.intentId;
    }

    /**
     * @return lgfText
     */
    public String getLgfText() {
        return this.lgfText;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    public static final class Builder extends Request.Builder<ListBeebotIntentLgfRequest, Builder> {
        private String instanceId; 
        private String intentId; 
        private String lgfText; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String scriptId; 

        private Builder() {
            super();
        } 

        private Builder(ListBeebotIntentLgfRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.intentId = request.intentId;
            this.lgfText = request.lgfText;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.scriptId = request.scriptId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e5035654-1745-484a-8c5b-165f7c7bcd79</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10717802</p>
         */
        public Builder intentId(String intentId) {
            this.putQueryParameter("IntentId", intentId);
            this.intentId = intentId;
            return this;
        }

        /**
         * LgfText.
         */
        public Builder lgfText(String lgfText) {
            this.putQueryParameter("LgfText", lgfText);
            this.lgfText = lgfText;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c5c5d8c0-c0f1-48a7-be2b-dc46006d888a</p>
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        @Override
        public ListBeebotIntentLgfRequest build() {
            return new ListBeebotIntentLgfRequest(this);
        } 

    } 

}
