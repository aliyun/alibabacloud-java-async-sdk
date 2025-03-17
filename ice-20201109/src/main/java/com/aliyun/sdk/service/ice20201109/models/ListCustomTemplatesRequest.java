// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListCustomTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListCustomTemplatesRequest</p>
 */
public class ListCustomTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Subtype")
    private String subtype;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private ListCustomTemplatesRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.orderBy = builder.orderBy;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.subtype = builder.subtype;
        this.templateId = builder.templateId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomTemplatesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return subtype
     */
    public String getSubtype() {
        return this.subtype;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListCustomTemplatesRequest, Builder> {
        private String name; 
        private String orderBy; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String subtype; 
        private String templateId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListCustomTemplatesRequest request) {
            super(request);
            this.name = request.name;
            this.orderBy = request.orderBy;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.subtype = request.subtype;
            this.templateId = request.templateId;
            this.type = request.type;
        } 

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-template</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The order in which the entries are sorted. Valid values:</p>
         * <ul>
         * <li>CreateTimeDesc: sorted by creation time in descending order.</li>
         * <li>CreateTimeAsc: sorted by creation time in ascending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CreateTimeDesc</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The subtype ID of the template.</p>
         * <ul>
         * <li><p>Valid values for transcoding templates:</p>
         * <ul>
         * <li>1 (Normal): regular template.</li>
         * <li>2 (AudioTranscode): audio transcoding template.</li>
         * <li>3 (Remux): container format conversion template.</li>
         * <li>4 (NarrowBandV1): Narrowband HD 1.0 template.</li>
         * <li>5 (NarrowBandV2): Narrowband HD 2.0 template.</li>
         * </ul>
         * </li>
         * <li><p>Valid values for snapshot templates:</p>
         * <ul>
         * <li>1 (Normal): regular template.</li>
         * <li>2 (Sprite): sprite template.</li>
         * <li>3 (WebVtt): WebVTT template.</li>
         * </ul>
         * </li>
         * <li><p>Valid values for AI-assisted content moderation templates:</p>
         * <ul>
         * <li>1 (Video): video moderation template.</li>
         * <li>2 (Audio): audio moderation template.</li>
         * <li>3 (Image): image moderation template.</li>
         * </ul>
         * </li>
         * <li><p>Valid values for AI-assisted intelligent erasure templates:</p>
         * <ul>
         * <li>1 (VideoDelogo): logo erasure template.</li>
         * <li>2 (VideoDetext): subtitle erasure template.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder subtype(String subtype) {
            this.putQueryParameter("Subtype", subtype);
            this.subtype = subtype;
            return this;
        }

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The template type. Valid values:</p>
         * <ul>
         * <li>1: transcoding template.</li>
         * <li>2: snapshot template.</li>
         * <li>3: animated image template.</li>
         * <li>4. image watermark template.</li>
         * <li>5: text watermark template.</li>
         * <li>6: subtitle template.</li>
         * <li>7: AI-assisted content moderation template.</li>
         * <li>8: AI-assisted intelligent thumbnail template.</li>
         * <li>9: AI-assisted intelligent erasure template.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListCustomTemplatesRequest build() {
            return new ListCustomTemplatesRequest(this);
        } 

    } 

}
