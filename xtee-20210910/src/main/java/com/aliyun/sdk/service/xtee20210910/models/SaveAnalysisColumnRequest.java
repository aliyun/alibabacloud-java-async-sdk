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
 * {@link SaveAnalysisColumnRequest} extends {@link RequestModel}
 *
 * <p>SaveAnalysisColumnRequest</p>
 */
public class SaveAnalysisColumnRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("columns")
    @com.aliyun.core.annotation.Validation(required = true)
    private String columns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regId;

    private SaveAnalysisColumnRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.columns = builder.columns;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveAnalysisColumnRequest create() {
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
     * @return columns
     */
    public String getColumns() {
        return this.columns;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<SaveAnalysisColumnRequest, Builder> {
        private String lang; 
        private String columns; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(SaveAnalysisColumnRequest request) {
            super(request);
            this.lang = request.lang;
            this.columns = request.columns;
            this.regId = request.regId;
        } 

        /**
         * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
         * <p>Custom columns</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;variableName&quot;:&quot;requestId&quot;,&quot;variableTitle&quot;:&quot;RequestId&quot;,&quot;variableType&quot;:&quot;SYSTEM_BIND&quot;,&quot;isDefault&quot;:true},{&quot;variableName&quot;:&quot;eventTime&quot;,&quot;variableTitle&quot;:&quot;事件时间&quot;,&quot;variableType&quot;:&quot;SYSTEM_BIND&quot;,&quot;isDefault&quot;:true},{&quot;variableName&quot;:&quot;accountId&quot;,&quot;variableTitle&quot;:&quot;账号&quot;,&quot;variableType&quot;:&quot;SYSTEM_BIND&quot;,&quot;isDefault&quot;:true},{&quot;variableName&quot;:&quot;deviceId&quot;,&quot;variableTitle&quot;:&quot;设备ID&quot;,&quot;variableType&quot;:&quot;SYSTEM_BIND&quot;,&quot;isDefault&quot;:true},{&quot;variableName&quot;:&quot;eventCode&quot;,&quot;variableTitle&quot;:&quot;事件编码&quot;,&quot;variableType&quot;:&quot;SYSTEM_BIND&quot;,&quot;isDefault&quot;:true},{&quot;variableName&quot;:&quot;ip&quot;,&quot;variableTitle&quot;:&quot;IP&quot;,&quot;variableType&quot;:&quot;SYSTEM_BIND&quot;,&quot;isDefault&quot;:true},{&quot;variableName&quot;:&quot;score&quot;,&quot;variableTitle&quot;:&quot;分值&quot;,&quot;variableType&quot;:&quot;SYSTEM_BIND&quot;,&quot;isDefault&quot;:true},{&quot;variableName&quot;:&quot;tags&quot;,&quot;variableTitle&quot;:&quot;标签&quot;,&quot;variableType&quot;:&quot;SYSTEM_BIND&quot;,&quot;isDefault&quot;:true},{&quot;variableName&quot;:&quot;DEtest222&quot;,&quot;variableTitle&quot;:&quot;测试222&quot;,&quot;variableType&quot;:&quot;NATIVE&quot;,&quot;isDefault&quot;:false}]</p>
         */
        public Builder columns(String columns) {
            this.putQueryParameter("columns", columns);
            this.columns = columns;
            return this;
        }

        /**
         * <p>Region code</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public SaveAnalysisColumnRequest build() {
            return new SaveAnalysisColumnRequest(this);
        } 

    } 

}
