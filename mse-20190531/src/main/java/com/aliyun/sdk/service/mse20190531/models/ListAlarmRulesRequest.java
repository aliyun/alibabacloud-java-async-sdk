// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlarmRulesRequest} extends {@link RequestModel}
 *
 * <p>ListAlarmRulesRequest</p>
 */
public class ListAlarmRulesRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("AlarmMseType")
    @Validation(required = true)
    private String alarmMseType;

    @Query
    @NameInMap("PageNum")
    @Validation(required = true)
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("RequestPars")
    private String requestPars;

    private ListAlarmRulesRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.alarmMseType = builder.alarmMseType;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestPars = builder.requestPars;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlarmRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return alarmMseType
     */
    public String getAlarmMseType() {
        return this.alarmMseType;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestPars
     */
    public String getRequestPars() {
        return this.requestPars;
    }

    public static final class Builder extends Request.Builder<ListAlarmRulesRequest, Builder> {
        private String acceptLanguage; 
        private String alarmMseType; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String requestPars; 

        private Builder() {
            super();
        } 

        private Builder(ListAlarmRulesRequest response) {
            super(response);
            this.acceptLanguage = response.acceptLanguage;
            this.alarmMseType = response.alarmMseType;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
            this.requestPars = response.requestPars;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * AlarmMseType.
         */
        public Builder alarmMseType(String alarmMseType) {
            this.putQueryParameter("AlarmMseType", alarmMseType);
            this.alarmMseType = alarmMseType;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestPars.
         */
        public Builder requestPars(String requestPars) {
            this.putQueryParameter("RequestPars", requestPars);
            this.requestPars = requestPars;
            return this;
        }

        @Override
        public ListAlarmRulesRequest build() {
            return new ListAlarmRulesRequest(this);
        } 

    } 

}
