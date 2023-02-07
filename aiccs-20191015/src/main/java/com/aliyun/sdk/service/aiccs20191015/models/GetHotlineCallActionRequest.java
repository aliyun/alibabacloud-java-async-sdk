// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotlineCallActionRequest} extends {@link RequestModel}
 *
 * <p>GetHotlineCallActionRequest</p>
 */
public class GetHotlineCallActionRequest extends Request {
    @Body
    @NameInMap("Acc")
    private String acc;

    @Body
    @NameInMap("AccountName")
    private String accountName;

    @Body
    @NameInMap("Act")
    @Validation(maximum = 2147483647)
    private Integer act;

    @Body
    @NameInMap("Biz")
    private String biz;

    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("FromSource")
    private String fromSource;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
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
         * 热线自定义参数
         */
        public Builder acc(String acc) {
            this.putBodyParameter("Acc", acc);
            this.acc = acc;
            return this;
        }

        /**
         * AccountName.
         */
        public Builder accountName(String accountName) {
            this.putBodyParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * Act.
         */
        public Builder act(Integer act) {
            this.putBodyParameter("Act", act);
            this.act = act;
            return this;
        }

        /**
         * 业务自定义参数
         */
        public Builder biz(String biz) {
            this.putBodyParameter("Biz", biz);
            this.biz = biz;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * FromSource.
         */
        public Builder fromSource(String fromSource) {
            this.putBodyParameter("FromSource", fromSource);
            this.fromSource = fromSource;
            return this;
        }

        /**
         * InstanceId.
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
