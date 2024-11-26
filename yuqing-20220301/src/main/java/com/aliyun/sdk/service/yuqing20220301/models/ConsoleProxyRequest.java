// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yuqing20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ConsoleProxyRequest} extends {@link RequestModel}
 *
 * <p>ConsoleProxyRequest</p>
 */
public class ConsoleProxyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("appCode")
    private String appCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("interfaceName")
    private String interfaceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("paramJson")
    private String paramJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("teamHashId")
    private String teamHashId;

    private ConsoleProxyRequest(Builder builder) {
        super(builder);
        this.appCode = builder.appCode;
        this.interfaceName = builder.interfaceName;
        this.paramJson = builder.paramJson;
        this.requestId = builder.requestId;
        this.teamHashId = builder.teamHashId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConsoleProxyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    /**
     * @return interfaceName
     */
    public String getInterfaceName() {
        return this.interfaceName;
    }

    /**
     * @return paramJson
     */
    public String getParamJson() {
        return this.paramJson;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return teamHashId
     */
    public String getTeamHashId() {
        return this.teamHashId;
    }

    public static final class Builder extends Request.Builder<ConsoleProxyRequest, Builder> {
        private String appCode; 
        private String interfaceName; 
        private String paramJson; 
        private String requestId; 
        private String teamHashId; 

        private Builder() {
            super();
        } 

        private Builder(ConsoleProxyRequest request) {
            super(request);
            this.appCode = request.appCode;
            this.interfaceName = request.interfaceName;
            this.paramJson = request.paramJson;
            this.requestId = request.requestId;
            this.teamHashId = request.teamHashId;
        } 

        /**
         * appCode.
         */
        public Builder appCode(String appCode) {
            this.putBodyParameter("appCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * interfaceName.
         */
        public Builder interfaceName(String interfaceName) {
            this.putBodyParameter("interfaceName", interfaceName);
            this.interfaceName = interfaceName;
            return this;
        }

        /**
         * paramJson.
         */
        public Builder paramJson(String paramJson) {
            this.putBodyParameter("paramJson", paramJson);
            this.paramJson = paramJson;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("requestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * teamHashId.
         */
        public Builder teamHashId(String teamHashId) {
            this.putBodyParameter("teamHashId", teamHashId);
            this.teamHashId = teamHashId;
            return this;
        }

        @Override
        public ConsoleProxyRequest build() {
            return new ConsoleProxyRequest(this);
        } 

    } 

}
