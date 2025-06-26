// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oms20160615.models;

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
 * {@link GetIncrementMeasureDataByProxyRequest} extends {@link RequestModel}
 *
 * <p>GetIncrementMeasureDataByProxyRequest</p>
 */
public class GetIncrementMeasureDataByProxyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompressEnable")
    private Boolean compressEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataType")
    private String dataType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyEndTime")
    private Long modifyEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyStartTime")
    private Long modifyStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RowKeyMapStr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rowKeyMapStr;

    private GetIncrementMeasureDataByProxyRequest(Builder builder) {
        super(builder);
        this.compressEnable = builder.compressEnable;
        this.dataType = builder.dataType;
        this.domainCode = builder.domainCode;
        this.modifyEndTime = builder.modifyEndTime;
        this.modifyStartTime = builder.modifyStartTime;
        this.rowKeyMapStr = builder.rowKeyMapStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIncrementMeasureDataByProxyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return compressEnable
     */
    public Boolean getCompressEnable() {
        return this.compressEnable;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return domainCode
     */
    public String getDomainCode() {
        return this.domainCode;
    }

    /**
     * @return modifyEndTime
     */
    public Long getModifyEndTime() {
        return this.modifyEndTime;
    }

    /**
     * @return modifyStartTime
     */
    public Long getModifyStartTime() {
        return this.modifyStartTime;
    }

    /**
     * @return rowKeyMapStr
     */
    public String getRowKeyMapStr() {
        return this.rowKeyMapStr;
    }

    public static final class Builder extends Request.Builder<GetIncrementMeasureDataByProxyRequest, Builder> {
        private Boolean compressEnable; 
        private String dataType; 
        private String domainCode; 
        private Long modifyEndTime; 
        private Long modifyStartTime; 
        private String rowKeyMapStr; 

        private Builder() {
            super();
        } 

        private Builder(GetIncrementMeasureDataByProxyRequest request) {
            super(request);
            this.compressEnable = request.compressEnable;
            this.dataType = request.dataType;
            this.domainCode = request.domainCode;
            this.modifyEndTime = request.modifyEndTime;
            this.modifyStartTime = request.modifyStartTime;
            this.rowKeyMapStr = request.rowKeyMapStr;
        } 

        /**
         * CompressEnable.
         */
        public Builder compressEnable(Boolean compressEnable) {
            this.putQueryParameter("CompressEnable", compressEnable);
            this.compressEnable = compressEnable;
            return this;
        }

        /**
         * DataType.
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>XXDEMO</p>
         */
        public Builder domainCode(String domainCode) {
            this.putQueryParameter("DomainCode", domainCode);
            this.domainCode = domainCode;
            return this;
        }

        /**
         * ModifyEndTime.
         */
        public Builder modifyEndTime(Long modifyEndTime) {
            this.putQueryParameter("ModifyEndTime", modifyEndTime);
            this.modifyEndTime = modifyEndTime;
            return this;
        }

        /**
         * ModifyStartTime.
         */
        public Builder modifyStartTime(Long modifyStartTime) {
            this.putQueryParameter("ModifyStartTime", modifyStartTime);
            this.modifyStartTime = modifyStartTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ProviderId&quot;:&quot;26842&quot;,&quot;InstanceId&quot;:&quot;XXX&quot;,&quot;UserId&quot;:123,&quot;ProductId&quot;:&quot;XX&quot;}</p>
         */
        public Builder rowKeyMapStr(String rowKeyMapStr) {
            this.putQueryParameter("RowKeyMapStr", rowKeyMapStr);
            this.rowKeyMapStr = rowKeyMapStr;
            return this;
        }

        @Override
        public GetIncrementMeasureDataByProxyRequest build() {
            return new GetIncrementMeasureDataByProxyRequest(this);
        } 

    } 

}
