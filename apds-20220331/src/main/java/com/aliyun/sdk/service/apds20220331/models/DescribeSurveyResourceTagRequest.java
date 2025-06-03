// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apds20220331.models;

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
 * {@link DescribeSurveyResourceTagRequest} extends {@link RequestModel}
 *
 * <p>DescribeSurveyResourceTagRequest</p>
 */
public class DescribeSurveyResourceTagRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scene")
    private String scene;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceUserIdList")
    private java.util.List<Long> sourceUserIdList;

    private DescribeSurveyResourceTagRequest(Builder builder) {
        super(builder);
        this.scene = builder.scene;
        this.sourceUserIdList = builder.sourceUserIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSurveyResourceTagRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return sourceUserIdList
     */
    public java.util.List<Long> getSourceUserIdList() {
        return this.sourceUserIdList;
    }

    public static final class Builder extends Request.Builder<DescribeSurveyResourceTagRequest, Builder> {
        private String scene; 
        private java.util.List<Long> sourceUserIdList; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSurveyResourceTagRequest request) {
            super(request);
            this.scene = request.scene;
            this.sourceUserIdList = request.sourceUserIdList;
        } 

        /**
         * scene.
         */
        public Builder scene(String scene) {
            this.putBodyParameter("scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * sourceUserIdList.
         */
        public Builder sourceUserIdList(java.util.List<Long> sourceUserIdList) {
            this.putBodyParameter("sourceUserIdList", sourceUserIdList);
            this.sourceUserIdList = sourceUserIdList;
            return this;
        }

        @Override
        public DescribeSurveyResourceTagRequest build() {
            return new DescribeSurveyResourceTagRequest(this);
        } 

    } 

}
