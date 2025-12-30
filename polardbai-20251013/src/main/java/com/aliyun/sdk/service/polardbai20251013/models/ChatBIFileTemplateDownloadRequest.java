// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbai20251013.models;

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
 * {@link ChatBIFileTemplateDownloadRequest} extends {@link RequestModel}
 *
 * <p>ChatBIFileTemplateDownloadRequest</p>
 */
public class ChatBIFileTemplateDownloadRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableType;

    private ChatBIFileTemplateDownloadRequest(Builder builder) {
        super(builder);
        this.instanceName = builder.instanceName;
        this.tableType = builder.tableType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatBIFileTemplateDownloadRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return tableType
     */
    public String getTableType() {
        return this.tableType;
    }

    public static final class Builder extends Request.Builder<ChatBIFileTemplateDownloadRequest, Builder> {
        private String instanceName; 
        private String tableType; 

        private Builder() {
            super();
        } 

        private Builder(ChatBIFileTemplateDownloadRequest request) {
            super(request);
            this.instanceName = request.instanceName;
            this.tableType = request.tableType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2ze454l20me07****</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pattern/config</p>
         */
        public Builder tableType(String tableType) {
            this.putQueryParameter("TableType", tableType);
            this.tableType = tableType;
            return this;
        }

        @Override
        public ChatBIFileTemplateDownloadRequest build() {
            return new ChatBIFileTemplateDownloadRequest(this);
        } 

    } 

}
