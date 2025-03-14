// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link UpdateWhiteListStrategyStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateWhiteListStrategyStatusRequest</p>
 */
public class UpdateWhiteListStrategyStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String strategyIds;

    private UpdateWhiteListStrategyStatusRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
        this.status = builder.status;
        this.strategyIds = builder.strategyIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWhiteListStrategyStatusRequest create() {
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
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return strategyIds
     */
    public String getStrategyIds() {
        return this.strategyIds;
    }

    public static final class Builder extends Request.Builder<UpdateWhiteListStrategyStatusRequest, Builder> {
        private String lang; 
        private String sourceIp; 
        private Integer status; 
        private String strategyIds; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWhiteListStrategyStatusRequest request) {
            super(request);
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
            this.status = request.status;
            this.strategyIds = request.strategyIds;
        } 

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The source IP address of the request. You do not need to specify this parameter. It is automatically obtained by the system.</p>
         * 
         * <strong>example:</strong>
         * <p>219.143.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The status of the policy. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: deleted</li>
         * <li><strong>1</strong>: learning</li>
         * <li><strong>2</strong>: paused</li>
         * <li><strong>3</strong>: learning completed</li>
         * <li><strong>4</strong>: enabled</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>You can change the status to <strong>paused</strong> only if the policy status is <strong>learning</strong>.</p>
         * </li>
         * <li><p>You can change the status to <strong>learning</strong> only if the policy status is <strong>paused</strong>.</p>
         * </li>
         * <li><p>You can change the status to <strong>enabled</strong> only if the policy status is <strong>learning completed</strong>.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the policy.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeWhiteListStrategyList~~">DescribeWhiteListStrategyList</a> operation to obtain the ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8516</p>
         */
        public Builder strategyIds(String strategyIds) {
            this.putQueryParameter("StrategyIds", strategyIds);
            this.strategyIds = strategyIds;
            return this;
        }

        @Override
        public UpdateWhiteListStrategyStatusRequest build() {
            return new UpdateWhiteListStrategyStatusRequest(this);
        } 

    } 

}
