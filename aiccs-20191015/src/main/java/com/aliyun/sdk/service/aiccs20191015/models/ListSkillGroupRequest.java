// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link ListSkillGroupRequest} extends {@link RequestModel}
 *
 * <p>ListSkillGroupRequest</p>
 */
public class ListSkillGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelType")
    @com.aliyun.core.annotation.Validation(maximum = 7)
    private Integer channelType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private ListSkillGroupRequest(Builder builder) {
        super(builder);
        this.channelType = builder.channelType;
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSkillGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelType
     */
    public Integer getChannelType() {
        return this.channelType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<ListSkillGroupRequest, Builder> {
        private Integer channelType; 
        private String clientToken; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ListSkillGroupRequest request) {
            super(request);
            this.channelType = request.channelType;
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>The skill group channel type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Returns all skill groups.</li>
         * <li><strong>1</strong>: Voice skill group.</li>
         * <li><strong>2</strong>: Chat skill group.</li>
         * <li><strong>3</strong>: Chat and voice skill group.</li>
         * <li><strong>4</strong>: Ticket skill group.</li>
         * <li><strong>5</strong>: Voice and ticket skill group.</li>
         * <li><strong>6</strong>: Chat and ticket skill group.</li>
         * <li><strong>7</strong>: Chat, voice, and ticket skill group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder channelType(Integer channelType) {
            this.putQueryParameter("ChannelType", channelType);
            this.channelType = channelType;
            return this;
        }

        /**
         * <p>Unique ID of the customer request. Used for idempotency validation. You can generate it using UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>46c1341e-2648-447a-****-70b6a298d94d</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Artificial Intelligence Cloud Call Service (AICCS) instance ID.<br>You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc_xp_pre-cn-***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ListSkillGroupRequest build() {
            return new ListSkillGroupRequest(this);
        } 

    } 

}
