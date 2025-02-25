// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link GetSheetResponseBody} extends {@link TeaModel}
 *
 * <p>GetSheetResponseBody</p>
 */
public class GetSheetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("columnCount")
    private Long columnCount;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("lastNonEmptyColumn")
    private Long lastNonEmptyColumn;

    @com.aliyun.core.annotation.NameInMap("lastNonEmptyRow")
    private Long lastNonEmptyRow;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("rowCount")
    private Long rowCount;

    @com.aliyun.core.annotation.NameInMap("visibility")
    private String visibility;

    private GetSheetResponseBody(Builder builder) {
        this.columnCount = builder.columnCount;
        this.id = builder.id;
        this.lastNonEmptyColumn = builder.lastNonEmptyColumn;
        this.lastNonEmptyRow = builder.lastNonEmptyRow;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.rowCount = builder.rowCount;
        this.visibility = builder.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSheetResponseBody create() {
        return builder().build();
    }

    /**
     * @return columnCount
     */
    public Long getColumnCount() {
        return this.columnCount;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return lastNonEmptyColumn
     */
    public Long getLastNonEmptyColumn() {
        return this.lastNonEmptyColumn;
    }

    /**
     * @return lastNonEmptyRow
     */
    public Long getLastNonEmptyRow() {
        return this.lastNonEmptyRow;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rowCount
     */
    public Long getRowCount() {
        return this.rowCount;
    }

    /**
     * @return visibility
     */
    public String getVisibility() {
        return this.visibility;
    }

    public static final class Builder {
        private Long columnCount; 
        private String id; 
        private Long lastNonEmptyColumn; 
        private Long lastNonEmptyRow; 
        private String name; 
        private String requestId; 
        private Long rowCount; 
        private String visibility; 

        /**
         * columnCount.
         */
        public Builder columnCount(Long columnCount) {
            this.columnCount = columnCount;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * lastNonEmptyColumn.
         */
        public Builder lastNonEmptyColumn(Long lastNonEmptyColumn) {
            this.lastNonEmptyColumn = lastNonEmptyColumn;
            return this;
        }

        /**
         * lastNonEmptyRow.
         */
        public Builder lastNonEmptyRow(Long lastNonEmptyRow) {
            this.lastNonEmptyRow = lastNonEmptyRow;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * rowCount.
         */
        public Builder rowCount(Long rowCount) {
            this.rowCount = rowCount;
            return this;
        }

        /**
         * visibility.
         */
        public Builder visibility(String visibility) {
            this.visibility = visibility;
            return this;
        }

        public GetSheetResponseBody build() {
            return new GetSheetResponseBody(this);
        } 

    } 

}
