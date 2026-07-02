// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliyunauth20181222.models;

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
 * {@link GetDetailByOrderRequest} extends {@link RequestModel}
 *
 * <p>GetDetailByOrderRequest</p>
 */
public class GetDetailByOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Acceptor")
    @com.aliyun.core.annotation.Validation(required = true)
    private String acceptor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Channel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckAuthItems")
    private String checkAuthItems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmpId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String empId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OptSource")
    @com.aliyun.core.annotation.Validation(required = true)
    private String optSource;

    private GetDetailByOrderRequest(Builder builder) {
        super(builder);
        this.acceptor = builder.acceptor;
        this.bizNo = builder.bizNo;
        this.channel = builder.channel;
        this.checkAuthItems = builder.checkAuthItems;
        this.empId = builder.empId;
        this.language = builder.language;
        this.optSource = builder.optSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDetailByOrderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptor
     */
    public String getAcceptor() {
        return this.acceptor;
    }

    /**
     * @return bizNo
     */
    public String getBizNo() {
        return this.bizNo;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return checkAuthItems
     */
    public String getCheckAuthItems() {
        return this.checkAuthItems;
    }

    /**
     * @return empId
     */
    public String getEmpId() {
        return this.empId;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return optSource
     */
    public String getOptSource() {
        return this.optSource;
    }

    public static final class Builder extends Request.Builder<GetDetailByOrderRequest, Builder> {
        private String acceptor; 
        private String bizNo; 
        private String channel; 
        private String checkAuthItems; 
        private String empId; 
        private String language; 
        private String optSource; 

        private Builder() {
            super();
        } 

        private Builder(GetDetailByOrderRequest request) {
            super(request);
            this.acceptor = request.acceptor;
            this.bizNo = request.bizNo;
            this.channel = request.channel;
            this.checkAuthItems = request.checkAuthItems;
            this.empId = request.empId;
            this.language = request.language;
            this.optSource = request.optSource;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder acceptor(String acceptor) {
            this.putQueryParameter("Acceptor", acceptor);
            this.acceptor = acceptor;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder bizNo(String bizNo) {
            this.putQueryParameter("BizNo", bizNo);
            this.bizNo = bizNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder channel(String channel) {
            this.putQueryParameter("Channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * CheckAuthItems.
         */
        public Builder checkAuthItems(String checkAuthItems) {
            this.putQueryParameter("CheckAuthItems", checkAuthItems);
            this.checkAuthItems = checkAuthItems;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder empId(String empId) {
            this.putQueryParameter("EmpId", empId);
            this.empId = empId;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder optSource(String optSource) {
            this.putQueryParameter("OptSource", optSource);
            this.optSource = optSource;
            return this;
        }

        @Override
        public GetDetailByOrderRequest build() {
            return new GetDetailByOrderRequest(this);
        } 

    } 

}
