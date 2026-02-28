// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryImportedDeviceByApplyIdRequest} extends {@link RequestModel}
 *
 * <p>QueryImportedDeviceByApplyIdRequest</p>
 */
public class QueryImportedDeviceByApplyIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplyId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long applyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100000, minimum = 1)
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 1000, minimum = 1)
    private Integer pageSize;

    private QueryImportedDeviceByApplyIdRequest(Builder builder) {
        super(builder);
        this.applyId = builder.applyId;
        this.iotInstanceId = builder.iotInstanceId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryImportedDeviceByApplyIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyId
     */
    public Long getApplyId() {
        return this.applyId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<QueryImportedDeviceByApplyIdRequest, Builder> {
        private Long applyId; 
        private String iotInstanceId; 
        private Integer pageNo; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(QueryImportedDeviceByApplyIdRequest request) {
            super(request);
            this.applyId = request.applyId;
            this.iotInstanceId = request.iotInstanceId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The application ID. You can call the <a href="https://help.aliyun.com/document_detail/433878.html">BatchImportDevice</a> operation to obtain the application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1295006</p>
         */
        public Builder applyId(Long applyId) {
            this.putQueryParameter("ApplyId", applyId);
            this.applyId = applyId;
            return this;
        }

        /**
         * <p>The instance ID. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <p> If your instance has an ID, you must specify this parameter. Otherwise, the request fails. If no Overview page exists or no instance ID is displayed, you do not need to specify this parameter.</p>
         * </blockquote>
         * <p>For more information, see the <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a> topic of IoT instances.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-1n8t****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The page number. Valid values: 1 to 10000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Valid values: 1 to 50.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public QueryImportedDeviceByApplyIdRequest build() {
            return new QueryImportedDeviceByApplyIdRequest(this);
        } 

    } 

}
