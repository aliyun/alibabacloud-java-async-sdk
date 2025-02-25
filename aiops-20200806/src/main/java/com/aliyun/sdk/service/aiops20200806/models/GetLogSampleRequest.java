// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLogSampleRequest} extends {@link RequestModel}
 *
 * <p>GetLogSampleRequest</p>
 */
public class GetLogSampleRequest extends Request {
    @Query
    @NameInMap("AppField")
    private String appField;

    @Query
    @NameInMap("AppValue")
    private String appValue;

    @Query
    @NameInMap("DataSourceId")
    private Long dataSourceId;

    @Query
    @NameInMap("LogField")
    private String logField;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private GetLogSampleRequest(Builder builder) {
        super(builder);
        this.appField = builder.appField;
        this.appValue = builder.appValue;
        this.dataSourceId = builder.dataSourceId;
        this.logField = builder.logField;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLogSampleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appField
     */
    public String getAppField() {
        return this.appField;
    }

    /**
     * @return appValue
     */
    public String getAppValue() {
        return this.appValue;
    }

    /**
     * @return dataSourceId
     */
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return logField
     */
    public String getLogField() {
        return this.logField;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<GetLogSampleRequest, Builder> {
        private String appField; 
        private String appValue; 
        private Long dataSourceId; 
        private String logField; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(GetLogSampleRequest request) {
            super(request);
            this.appField = request.appField;
            this.appValue = request.appValue;
            this.dataSourceId = request.dataSourceId;
            this.logField = request.logField;
            this.operaUid = request.operaUid;
        } 

        /**
         * AppField.
         */
        public Builder appField(String appField) {
            this.putQueryParameter("AppField", appField);
            this.appField = appField;
            return this;
        }

        /**
         * AppValue.
         */
        public Builder appValue(String appValue) {
            this.putQueryParameter("AppValue", appValue);
            this.appValue = appValue;
            return this;
        }

        /**
         * DataSourceId.
         */
        public Builder dataSourceId(Long dataSourceId) {
            this.putQueryParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * LogField.
         */
        public Builder logField(String logField) {
            this.putQueryParameter("LogField", logField);
            this.logField = logField;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        @Override
        public GetLogSampleRequest build() {
            return new GetLogSampleRequest(this);
        } 

    } 

}
