// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeRecommendVariablesVelocityRequest} extends {@link RequestModel}
 *
 * <p>DescribeRecommendVariablesVelocityRequest</p>
 */
public class DescribeRecommendVariablesVelocityRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("variableIdsStr")
    private String variableIdsStr;

    private DescribeRecommendVariablesVelocityRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.taskId = builder.taskId;
        this.variableIdsStr = builder.variableIdsStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecommendVariablesVelocityRequest create() {
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
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return variableIdsStr
     */
    public String getVariableIdsStr() {
        return this.variableIdsStr;
    }

    public static final class Builder extends Request.Builder<DescribeRecommendVariablesVelocityRequest, Builder> {
        private String lang; 
        private String regId; 
        private Long taskId; 
        private String variableIdsStr; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRecommendVariablesVelocityRequest request) {
            super(request);
            this.lang = request.lang;
            this.regId = request.regId;
            this.taskId = request.taskId;
            this.variableIdsStr = request.variableIdsStr;
        } 

        /**
         * <p>Set the language type for request and response, default value is <strong>zh</strong>. Values:</p>
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
         * <p>Region Code</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>Task ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6770764</p>
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>Variable IDs</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;232&quot;,&quot;233&quot;]</p>
         */
        public Builder variableIdsStr(String variableIdsStr) {
            this.putQueryParameter("variableIdsStr", variableIdsStr);
            this.variableIdsStr = variableIdsStr;
            return this;
        }

        @Override
        public DescribeRecommendVariablesVelocityRequest build() {
            return new DescribeRecommendVariablesVelocityRequest(this);
        } 

    } 

}
