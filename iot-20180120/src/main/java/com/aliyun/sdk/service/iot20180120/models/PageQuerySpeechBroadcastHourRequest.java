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
 * {@link PageQuerySpeechBroadcastHourRequest} extends {@link RequestModel}
 *
 * <p>PageQuerySpeechBroadcastHourRequest</p>
 */
public class PageQuerySpeechBroadcastHourRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 2000, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageToken")
    private String pageToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryDateTimeHour")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queryDateTimeHour;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShareTaskCode")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The instance ID. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <p> If your instance has an ID, you must specify this parameter. Otherwise, the request fails. If no Overview page exists or no instance ID is displayed, you do not need to specify this parameter.</p>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a> of IoT instances.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-2w****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Valid values: 1 to 2000.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of <strong>PageToken</strong>.</p>
         * <p>For example, if you want to query the results on Page n, you must set PageToken to the token that you obtained when you queried the results on Page n - 1.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291cm****</p>
         */
        public Builder pageToken(String pageToken) {
            this.putBodyParameter("PageToken", pageToken);
            this.pageToken = pageToken;
            return this;
        }

        /**
         * <p>The end time of the hour in which you want to query data. Example: 2020090919, which specifies 19:00 on September 9, 2020.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2020090919</p>
         */
        public Builder queryDateTimeHour(String queryDateTimeHour) {
            this.putQueryParameter("QueryDateTimeHour", queryDateTimeHour);
            this.queryDateTimeHour = queryDateTimeHour;
            return this;
        }

        /**
         * <p>The code of the speech sharing task.</p>
         * <p>You can obtain the <strong>code</strong> on the <strong>Shared Corpus Management</strong> page of <strong>Speech Sending Voice Broadcasting Service</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ebed9280_ba25_48df_80c2_****</p>
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
