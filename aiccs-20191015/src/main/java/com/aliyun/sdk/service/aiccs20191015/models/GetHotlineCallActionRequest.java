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
 * {@link GetHotlineCallActionRequest} extends {@link RequestModel}
 *
 * <p>GetHotlineCallActionRequest</p>
 */
public class GetHotlineCallActionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Acc")
    private String acc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountName")
    private String accountName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Act")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647)
    private Integer act;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Biz")
    private String biz;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FromSource")
    private String fromSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private GetHotlineCallActionRequest(Builder builder) {
        super(builder);
        this.acc = builder.acc;
        this.accountName = builder.accountName;
        this.act = builder.act;
        this.biz = builder.biz;
        this.clientToken = builder.clientToken;
        this.fromSource = builder.fromSource;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotlineCallActionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acc
     */
    public String getAcc() {
        return this.acc;
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return act
     */
    public Integer getAct() {
        return this.act;
    }

    /**
     * @return biz
     */
    public String getBiz() {
        return this.biz;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return fromSource
     */
    public String getFromSource() {
        return this.fromSource;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetHotlineCallActionRequest, Builder> {
        private String acc; 
        private String accountName; 
        private Integer act; 
        private String biz; 
        private String clientToken; 
        private String fromSource; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetHotlineCallActionRequest request) {
            super(request);
            this.acc = request.acc;
            this.accountName = request.accountName;
            this.act = request.act;
            this.biz = request.biz;
            this.clientToken = request.clientToken;
            this.fromSource = request.fromSource;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>Hotline Custom Parameter in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;time&quot;:1}</p>
         */
        public Builder acc(String acc) {
            this.putBodyParameter("Acc", acc);
            this.acc = acc;
            return this;
        }

        /**
         * <p>Agent account name, which is the phone number or mailbox specified during account registration. It is unique within the instance.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        public Builder accountName(String accountName) {
            this.putBodyParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>Operation Type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Hotline.</li>
         * <li><strong>2</strong>: Online.</li>
         * <li><strong>3</strong>: Ticket.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder act(Integer act) {
            this.putBodyParameter("Act", act);
            this.act = act;
            return this;
        }

        /**
         * <p>Business Custom Parameter in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:123}</p>
         */
        public Builder biz(String biz) {
            this.putBodyParameter("Biz", biz);
            this.biz = biz;
            return this;
        }

        /**
         * <p>Unique ID of the customer request. Used for idempotency validation. You can generate it by using a UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>46c1341e-2648-447a-9b11-70b6a298d9****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Source type. Valid values:</p>
         * <ul>
         * <li><strong>hotlinebs_out</strong>: Hotline.</li>
         * <li><strong>ticket_out</strong>: Ticket.</li>
         * <li><strong>other_system_out</strong>: Other system.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hotlinebs_out</p>
         */
        public Builder fromSource(String fromSource) {
            this.putBodyParameter("FromSource", fromSource);
            this.fromSource = fromSource;
            return this;
        }

        /**
         * <p>Artificial Intelligence Cloud Call Service (AICCS) instance ID.
         * You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc_xp_pre-cn-***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetHotlineCallActionRequest build() {
            return new GetHotlineCallActionRequest(this);
        } 

    } 

}
