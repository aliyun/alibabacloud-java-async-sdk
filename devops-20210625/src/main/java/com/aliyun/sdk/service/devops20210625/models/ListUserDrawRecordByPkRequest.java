// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserDrawRecordByPkRequest} extends {@link RequestModel}
 *
 * <p>ListUserDrawRecordByPkRequest</p>
 */
public class ListUserDrawRecordByPkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("aliyunPk")
    private String aliyunPk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("drawGroup")
    private String drawGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("drawPoolName")
    private String drawPoolName;

    private ListUserDrawRecordByPkRequest(Builder builder) {
        super(builder);
        this.aliyunPk = builder.aliyunPk;
        this.drawGroup = builder.drawGroup;
        this.drawPoolName = builder.drawPoolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserDrawRecordByPkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunPk
     */
    public String getAliyunPk() {
        return this.aliyunPk;
    }

    /**
     * @return drawGroup
     */
    public String getDrawGroup() {
        return this.drawGroup;
    }

    /**
     * @return drawPoolName
     */
    public String getDrawPoolName() {
        return this.drawPoolName;
    }

    public static final class Builder extends Request.Builder<ListUserDrawRecordByPkRequest, Builder> {
        private String aliyunPk; 
        private String drawGroup; 
        private String drawPoolName; 

        private Builder() {
            super();
        } 

        private Builder(ListUserDrawRecordByPkRequest request) {
            super(request);
            this.aliyunPk = request.aliyunPk;
            this.drawGroup = request.drawGroup;
            this.drawPoolName = request.drawPoolName;
        } 

        /**
         * aliyunPk.
         */
        public Builder aliyunPk(String aliyunPk) {
            this.putQueryParameter("aliyunPk", aliyunPk);
            this.aliyunPk = aliyunPk;
            return this;
        }

        /**
         * drawGroup.
         */
        public Builder drawGroup(String drawGroup) {
            this.putQueryParameter("drawGroup", drawGroup);
            this.drawGroup = drawGroup;
            return this;
        }

        /**
         * drawPoolName.
         */
        public Builder drawPoolName(String drawPoolName) {
            this.putQueryParameter("drawPoolName", drawPoolName);
            this.drawPoolName = drawPoolName;
            return this;
        }

        @Override
        public ListUserDrawRecordByPkRequest build() {
            return new ListUserDrawRecordByPkRequest(this);
        } 

    } 

}
