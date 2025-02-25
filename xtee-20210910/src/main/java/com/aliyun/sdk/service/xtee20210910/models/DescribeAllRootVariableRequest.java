// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAllRootVariableRequest} extends {@link RequestModel}
 *
 * <p>DescribeAllRootVariableRequest</p>
 */
public class DescribeAllRootVariableRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("deviceVariableIds")
    private String deviceVariableIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCode")
    private String eventCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("expressionVariableIds")
    private String expressionVariableIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nativeVariableIds")
    private String nativeVariableIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("queryVariableIds")
    private String queryVariableIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("velocityVariableIds")
    private String velocityVariableIds;

    private DescribeAllRootVariableRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
        this.deviceVariableIds = builder.deviceVariableIds;
        this.eventCode = builder.eventCode;
        this.expressionVariableIds = builder.expressionVariableIds;
        this.id = builder.id;
        this.nativeVariableIds = builder.nativeVariableIds;
        this.queryVariableIds = builder.queryVariableIds;
        this.regId = builder.regId;
        this.velocityVariableIds = builder.velocityVariableIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAllRootVariableRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return deviceVariableIds
     */
    public String getDeviceVariableIds() {
        return this.deviceVariableIds;
    }

    /**
     * @return eventCode
     */
    public String getEventCode() {
        return this.eventCode;
    }

    /**
     * @return expressionVariableIds
     */
    public String getExpressionVariableIds() {
        return this.expressionVariableIds;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return nativeVariableIds
     */
    public String getNativeVariableIds() {
        return this.nativeVariableIds;
    }

    /**
     * @return queryVariableIds
     */
    public String getQueryVariableIds() {
        return this.queryVariableIds;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return velocityVariableIds
     */
    public String getVelocityVariableIds() {
        return this.velocityVariableIds;
    }

    public static final class Builder extends Request.Builder<DescribeAllRootVariableRequest, Builder> {
        private String lang; 
        private String sourceIp; 
        private String deviceVariableIds; 
        private String eventCode; 
        private String expressionVariableIds; 
        private Long id; 
        private String nativeVariableIds; 
        private String queryVariableIds; 
        private String regId; 
        private String velocityVariableIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAllRootVariableRequest request) {
            super(request);
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
            this.deviceVariableIds = request.deviceVariableIds;
            this.eventCode = request.eventCode;
            this.expressionVariableIds = request.expressionVariableIds;
            this.id = request.id;
            this.nativeVariableIds = request.nativeVariableIds;
            this.queryVariableIds = request.queryVariableIds;
            this.regId = request.regId;
            this.velocityVariableIds = request.velocityVariableIds;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * deviceVariableIds.
         */
        public Builder deviceVariableIds(String deviceVariableIds) {
            this.putQueryParameter("deviceVariableIds", deviceVariableIds);
            this.deviceVariableIds = deviceVariableIds;
            return this;
        }

        /**
         * eventCode.
         */
        public Builder eventCode(String eventCode) {
            this.putQueryParameter("eventCode", eventCode);
            this.eventCode = eventCode;
            return this;
        }

        /**
         * expressionVariableIds.
         */
        public Builder expressionVariableIds(String expressionVariableIds) {
            this.putQueryParameter("expressionVariableIds", expressionVariableIds);
            this.expressionVariableIds = expressionVariableIds;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * nativeVariableIds.
         */
        public Builder nativeVariableIds(String nativeVariableIds) {
            this.putQueryParameter("nativeVariableIds", nativeVariableIds);
            this.nativeVariableIds = nativeVariableIds;
            return this;
        }

        /**
         * queryVariableIds.
         */
        public Builder queryVariableIds(String queryVariableIds) {
            this.putQueryParameter("queryVariableIds", queryVariableIds);
            this.queryVariableIds = queryVariableIds;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * velocityVariableIds.
         */
        public Builder velocityVariableIds(String velocityVariableIds) {
            this.putQueryParameter("velocityVariableIds", velocityVariableIds);
            this.velocityVariableIds = velocityVariableIds;
            return this;
        }

        @Override
        public DescribeAllRootVariableRequest build() {
            return new DescribeAllRootVariableRequest(this);
        } 

    } 

}
