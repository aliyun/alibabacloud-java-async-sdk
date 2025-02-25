// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSyncReportDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeSyncReportDetailRequest</p>
 */
public class DescribeSyncReportDetailRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 4102416000D, minimum = 1565193600)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("levelType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String levelType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 4102416000D, minimum = 1565193600)
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private DescribeSyncReportDetailRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.endTime = builder.endTime;
        this.levelType = builder.levelType;
        this.startTime = builder.startTime;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSyncReportDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return levelType
     */
    public String getLevelType() {
        return this.levelType;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeSyncReportDetailRequest, Builder> {
        private String instanceId; 
        private Long endTime; 
        private String levelType; 
        private Long startTime; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSyncReportDetailRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.endTime = request.endTime;
            this.levelType = request.levelType;
            this.startTime = request.startTime;
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-cn-o400whm78004</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1586673466</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>error</p>
         */
        public Builder levelType(String levelType) {
            this.putQueryParameter("levelType", levelType);
            this.levelType = levelType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1586673466</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>behavior</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeSyncReportDetailRequest build() {
            return new DescribeSyncReportDetailRequest(this);
        } 

    } 

}
