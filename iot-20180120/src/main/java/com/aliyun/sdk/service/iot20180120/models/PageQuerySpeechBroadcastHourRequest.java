// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PageQuerySpeechBroadcastHourRequest} extends {@link RequestModel}
 *
 * <p>PageQuerySpeechBroadcastHourRequest</p>
 */
public class PageQuerySpeechBroadcastHourRequest extends Request {
    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("PageSize")
    @Validation(maximum = 2000, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("PageToken")
    private String pageToken;

    @Query
    @NameInMap("QueryDateTimeHour")
    @Validation(required = true)
    private String queryDateTimeHour;

    @Body
    @NameInMap("ShareTaskCode")
    @Validation(required = true)
    private String shareTaskCode;

    private PageQuerySpeechBroadcastHourRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.pageSize = builder.pageSize;
        this.pageToken = builder.pageToken;
        this.queryDateTimeHour = builder.queryDateTimeHour;
        this.shareTaskCode = builder.shareTaskCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PageQuerySpeechBroadcastHourRequest create() {
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pageToken
     */
    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * @return queryDateTimeHour
     */
    public String getQueryDateTimeHour() {
        return this.queryDateTimeHour;
    }

    /**
     * @return shareTaskCode
     */
    public String getShareTaskCode() {
        return this.shareTaskCode;
    }

    public static final class Builder extends Request.Builder<PageQuerySpeechBroadcastHourRequest, Builder> {
        private String iotInstanceId; 
        private Integer pageSize; 
        private String pageToken; 
        private String queryDateTimeHour; 
        private String shareTaskCode; 

        private Builder() {
            super();
        } 

        private Builder(PageQuerySpeechBroadcastHourRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.pageSize = request.pageSize;
            this.pageToken = request.pageToken;
            this.queryDateTimeHour = request.queryDateTimeHour;
            this.shareTaskCode = request.shareTaskCode;
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
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PageToken.
         */
        public Builder pageToken(String pageToken) {
            this.putBodyParameter("PageToken", pageToken);
            this.pageToken = pageToken;
            return this;
        }

        /**
         * QueryDateTimeHour.
         */
        public Builder queryDateTimeHour(String queryDateTimeHour) {
            this.putQueryParameter("QueryDateTimeHour", queryDateTimeHour);
            this.queryDateTimeHour = queryDateTimeHour;
            return this;
        }

        /**
         * ShareTaskCode.
         */
        public Builder shareTaskCode(String shareTaskCode) {
            this.putBodyParameter("ShareTaskCode", shareTaskCode);
            this.shareTaskCode = shareTaskCode;
            return this;
        }

        @Override
        public PageQuerySpeechBroadcastHourRequest build() {
            return new PageQuerySpeechBroadcastHourRequest(this);
        } 

    } 

}
