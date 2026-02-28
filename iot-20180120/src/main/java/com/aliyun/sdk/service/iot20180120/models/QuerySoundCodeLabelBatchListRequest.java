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
 * {@link QuerySoundCodeLabelBatchListRequest} extends {@link RequestModel}
 *
 * <p>QuerySoundCodeLabelBatchListRequest</p>
 */
public class QuerySoundCodeLabelBatchListRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageId")
    @com.aliyun.core.annotation.Validation(maximum = 10000, minimum = 1)
    private Integer pageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScheduleCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scheduleCode;

    private QuerySoundCodeLabelBatchListRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.pageId = builder.pageId;
        this.pageSize = builder.pageSize;
        this.scheduleCode = builder.scheduleCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySoundCodeLabelBatchListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return pageId
     */
    public Integer getPageId() {
        return this.pageId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return scheduleCode
     */
    public String getScheduleCode() {
        return this.scheduleCode;
    }

    public static final class Builder extends Request.Builder<QuerySoundCodeLabelBatchListRequest, Builder> {
        private String iotInstanceId; 
        private Integer pageId; 
        private Integer pageSize; 
        private String scheduleCode; 

        private Builder() {
            super();
        } 

        private Builder(QuerySoundCodeLabelBatchListRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.pageId = request.pageId;
            this.pageSize = request.pageSize;
            this.scheduleCode = request.scheduleCode;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * PageId.
         */
        public Builder pageId(Integer pageId) {
            this.putBodyParameter("PageId", pageId);
            this.pageId = pageId;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Md3ZiTL888K9llXDy7890***********</p>
         */
        public Builder scheduleCode(String scheduleCode) {
            this.putBodyParameter("ScheduleCode", scheduleCode);
            this.scheduleCode = scheduleCode;
            return this;
        }

        @Override
        public QuerySoundCodeLabelBatchListRequest build() {
            return new QuerySoundCodeLabelBatchListRequest(this);
        } 

    } 

}
